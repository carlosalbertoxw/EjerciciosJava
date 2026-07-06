# EjerciciosJava

Colección de ejercicios de programación en Java, **clasificados por tema** y ordenados
**de lo más básico a lo más avanzado**. El proyecto usa **Maven** (Java 21) y se importa
directamente en Eclipse, IntelliJ o NetBeans.

## Estructura del proyecto

Layout estándar de Maven. Todo el código vive bajo el paquete raíz
`com.carlos.ejercicios`:

```
src/main/java/com/carlos/ejercicios/
├── basico/            (01) Fundamentos del lenguaje
├── poo/               (02) Programación orientada a objetos
├── estructurasdedatos/(03) Estructuras de datos y algoritmos
├── archivos/          (04) Lectura y escritura de archivos
├── patrones/          (05) Patrones de diseño
└── imagenes/          (06) Procesamiento de imágenes
```

Cada clase de ejemplo tiene su propio método `main`, así que puede ejecutarse de forma
independiente.

## Ruta de aprendizaje

### 01 · `basico` — Fundamentos del lenguaje
Primer contacto con la sintaxis: entrada/salida, tipos, operadores y control de flujo.

| # | Clase | Tema |
|---|-------|------|
| 1 | `HolaMundo` | Imprimir por consola y con `JOptionPane` |
| 2 | `TiposDeDatos` | Tipos primitivos y sus rangos |
| 3 | `Operadores` | Operadores aritméticos, relacionales, lógicos, de asignación e incremento |
| 4 | `IngresarImprimirDatos` | Leer datos del usuario (`Scanner`, `BufferedReader`, `JOptionPane`) |
| 5 | `SentenciaIfElse` | Condicional `if / else` |
| 6 | `SentenciaSwitch` | Condicional `switch` |
| 7 | `CicloWhile` | Bucle `while` |
| 8 | `CicloDoWhile` | Bucle `do-while` |
| 9 | `CicloFor` | Bucle `for` (tabla de multiplicar) |

> Los ejercicios 4–9 son interactivos: piden datos por consola o mediante diálogos.

### 02 · `poo` — Programación orientada a objetos
Clases, encapsulamiento y los pilares de la POO.

- `Clase`, `ModificadoresDeAcceso` — estructura de una clase y visibilidad (`public/protected/default/private`).
- `herencia/` — `Persona`, `Alumno`, `TestHerencia`: reutilización mediante herencia.
- `polimorfismo/` — `Animal`, `Perro`, `Vaca`, `TestPolimorfismo`: sobreescritura y polimorfismo.

### 03 · `estructurasdedatos` — Estructuras de datos y algoritmos
Desde el uso de la API de Java hasta implementaciones propias.

- `ListasApiJava` — operaciones con `ArrayList` y `LinkedList`.
- `PilaApiJava` — comportamiento LIFO con `Stack`.
- `MetodosDeBusqueda` — búsqueda lineal y binaria (arreglo, matriz y lista).
- `ArbolBinarioOrdenado` — árbol binario de búsqueda con recorridos y altura.
- `listas/` — `InterfazLista`, `ListaGenerica`, `ListaCircular`, `ListaDoblementeEnlazada`.
- `ordenamiento/` — `BubbleSort`, `InsertionSort`, `SelectionSort`, `QuickSort`.

### 04 · `archivos` — Entrada/salida en archivos
- `EscribirEnArchivoDeTexto`, `LeerArchivoDeTexto`.

### 05 · `patrones` — Patrones de diseño
- `factory/`, `factory2/` — patrón **Factory** (versión de consola y versión con Swing).
- `singleton/`, `singleton2/` — patrón **Singleton** (versión de consola y versión con Swing).

### 06 · `imagenes` — Procesamiento de imágenes
- `RedimencionarImagen` — genera una miniatura conservando la proporción. Su `main` crea una
  imagen de ejemplo y la miniatura en la carpeta `salida/` del proyecto (no versionada).

## Requisitos

- **JDK 21** o superior.
- **Maven 3.9+** (opcional si usas un IDE con Maven integrado).

## Compilar y ejecutar

Compilar todo el proyecto:

```bash
mvn clean compile
```

Cada ejercicio tiene su propio método `main`. Para ejecutar uno cualquiera:

```bash
mvn exec:java -Dexec.mainClass=com.carlos.ejercicios.basico.HolaMundo
```

O, sin Maven, tras compilar:

```bash
java -cp target/classes com.carlos.ejercicios.estructurasdedatos.ordenamiento.QuickSort
```

## Importar en Eclipse

1. `File > Import... > Maven > Existing Maven Projects`.
2. Selecciona la carpeta del proyecto (la que contiene `pom.xml`).
3. Finaliza. Eclipse resuelve el `pom.xml` y configura el classpath automáticamente.
4. Ejecuta cualquier ejercicio con clic derecho sobre la clase → `Run As > Java Application`.
