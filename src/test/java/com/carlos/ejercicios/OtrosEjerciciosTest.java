package com.carlos.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.carlos.ejercicios.imagenes.RedimensionarImagen;
import com.carlos.ejercicios.patrones.factory.Circle;
import com.carlos.ejercicios.patrones.factory.ShapeFactory;
import com.carlos.ejercicios.patrones.singleton.Singleton;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OtrosEjerciciosTest {

    @Test
    void fabricaCreaLaFormaSinImportarMayusculas() {
        assertInstanceOf(Circle.class, new ShapeFactory().getShape("circulo"));
    }

    @Test
    void fabricaRechazaFormasDesconocidas() {
        assertThrows(IllegalArgumentException.class, () -> new ShapeFactory().getShape("hexagono"));
    }

    @Test
    void singletonEsSiempreElMismoObjeto() {
        assertSame(Singleton.INSTANCIA, Singleton.valueOf("INSTANCIA"));
    }

    @ParameterizedTest
    @CsvSource({
        "400, 250, 150, 94",   // horizontal: limita el ancho
        "250, 400, 94, 150",   // vertical: limita el alto
        "300, 300, 150, 150",  // cuadrada
        "100, 50, 100, 50",    // pequeña: no se agranda
        "3000, 1, 150, 1",     // muy alargada: nunca llega a 0 de alto
    })
    void miniaturaConservaLaProporcion(int ancho, int alto, int anchoEsperado, int altoEsperado) {
        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        BufferedImage miniatura = RedimensionarImagen.crearMiniatura(imagen);

        assertEquals(anchoEsperado, miniatura.getWidth());
        assertEquals(altoEsperado, miniatura.getHeight());
    }

    @Test
    void guardarYCargarUnaImagen(@TempDir Path carpeta) throws IOException {
        File archivo = carpeta.resolve("subcarpeta/imagen.png").toFile();

        RedimensionarImagen.guardar(new BufferedImage(5, 4, BufferedImage.TYPE_INT_RGB), archivo);

        assertEquals(5, RedimensionarImagen.cargar(archivo).getWidth());
    }
}
