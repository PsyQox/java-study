public class Matrices {

    // ============ ARRAYS MULTIDIMENSIONALES (MATRICES) ============
    // Un array multidimensional es un array de arrays
    // El más común es el bidimensional (2D): filas y columnas

    public static void main(String[] args) {

        // ============ CREAR MATRIZ 2D ============

        // Forma 1: Solo tamaño (3 filas x 4 columnas)
        // int[][] numeros = new int[3][4];  // Valores por defecto: 0

        // Forma 2: Con valores directamente
        int[][] matriz2 = {
            {1, 2, 3},  // fila 0
            {4, 5, 6},  // fila 1
            {7, 8, 9}   // fila 2
        };

        // ============ ACCEDER Y MODIFICAR ============
        // Sintaxis: matriz[fila][columna]
        // Índices empiezan en 0

        System.out.println("=== Acceder a elementos ===");
        System.out.println("matriz2[1][1] = " + matriz2[1][1]);  // 5 (fila 1, columna 1)

        // Modificar elemento
        // matriz2[1][1] = 100;  // Cambiaría el 5 por 100

        // ============ TAMAÑOS ============
        // matriz.length = número de filas
        // matriz[i].length = número de columnas en la fila i

        System.out.println("\n=== Tamaños ===");
        System.out.println("Filas: " + matriz2.length);        // 3 filas
        System.out.println("Columnas: " + matriz2[0].length);  // 3 columnas

        // ============ RECORRER MATRIZ CON FOR CLÁSICO ============
        // For anidado: el externo recorre filas, el interno recorre columnas
        // print() mantiene en la misma línea, println() salta a la siguiente

        System.out.println("\n=== Matriz en formato tabla ===");
        int suma = 0;
        for (int i = 0; i < matriz2.length; i++) {           // filas
            for (int j = 0; j < matriz2[i].length; j++) {    // columnas
                System.out.print(matriz2[i][j] + " ");
                suma += matriz2[i][j];
            }
            System.out.println();  // Salto de línea al terminar cada fila
        }

        // ============ DIAGONAL PRINCIPAL ============
        // En una matriz cuadrada: posiciones donde fila == columna
        // [0][0], [1][1], [2][2], etc.

        System.out.println("\n=== Diagonal principal ===");
        System.out.println(matriz2[0][0]);  // 1
        System.out.println(matriz2[1][1]);  // 5
        System.out.println(matriz2[2][2]);  // 9

        // TIP: Con bucle sería:
        // for (int i = 0; i < matriz2.length; i++) {
        //     System.out.println(matriz2[i][i]);
        // }

        System.out.println("\n=== Suma total ===");
        System.out.println("Suma de todos los elementos: " + suma);

        // ============ RECORRER CON FOR-EACH ANIDADO ============
        // Más limpio cuando no necesitas los índices
        // int[] fila = cada fila es un array
        // int valor = cada elemento dentro de la fila

        System.out.println("\n=== For-each anidado ===");
        for (int[] fila : matriz2) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
