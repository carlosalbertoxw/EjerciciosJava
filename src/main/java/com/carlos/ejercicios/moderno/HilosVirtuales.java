package com.carlos.ejercicios.moderno;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Concurrencia con hilos virtuales: son tan ligeros que se puede crear uno por tarea,
 * incluso miles. Convienen cuando las tareas pasan el tiempo ESPERANDO (red, disco),
 * aquí simulado con sleep.
 *
 * @author Carlos
 */
public class HilosVirtuales {

    private static String descargar(int id) throws InterruptedException {
        Thread.sleep(Duration.ofMillis(200));
        return "archivo-" + id;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Cada tarea corre en su propio hilo virtual; el try espera a que terminen.
        long inicio = System.nanoTime();
        List<Future<String>> futuros = new ArrayList<>();
        try (ExecutorService ejecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int id = 1; id <= 5; id++) {
                int actual = id; // una lambda solo captura variables que no cambian
                futuros.add(ejecutor.submit(() -> descargar(actual)));
            }
        }
        for (Future<String> futuro : futuros) {
            System.out.println("Listo: " + futuro.get());
        }
        System.out.printf("5 tareas de 200 ms en %d ms (en secuencia serían unos 1000 ms)%n",
                (System.nanoTime() - inicio) / 1_000_000);

        // Varias tareas modificando un dato: AtomicInteger evita perder incrementos.
        AtomicInteger contador = new AtomicInteger();
        try (ExecutorService ejecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10_000; i++) {
                ejecutor.submit(contador::incrementAndGet);
            }
        }
        System.out.println("Contador con 10 000 hilos virtuales: " + contador.get());
    }
}
