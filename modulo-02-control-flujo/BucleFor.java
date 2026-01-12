public class BucleFor {
    public static void main(String[] args) {

        // ============ FOR CLÁSICO ============
        // Sintaxis: for (inicialización; condición; incremento)
        // - inicialización: se ejecuta UNA vez al inicio
        // - condición: se evalúa ANTES de cada iteración (si es false, termina)
        // - incremento: se ejecuta DESPUÉS de cada iteración

        // Imprimir números del 1 al 10
        System.out.println("=== Números del 1 al 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // ============ FOR CON CONDICIÓN ============
        // Números pares usando módulo (%)
        // % devuelve el residuo: si x % 2 == 0, es par
        System.out.println("\n=== Números pares del 2 al 20 ===");
        for (int x = 1; x <= 20; x++) {
            if ((x % 2) == 0) {
                System.out.println("Numero par: " + x);
            }
        }

        // Alternativa más eficiente: empezar en 2 e incrementar de 2 en 2
        // for (int x = 2; x <= 20; x += 2) { ... }

        // ============ FOR PARA TABLAS ============
        System.out.println("\n=== Tabla del 5 ===");
        for (int y = 1; y <= 10; y++) {
            System.out.println("5 x " + y + " = " + (5 * y));
        }

        // ============ FOR-EACH ============
        // Sintaxis: for (tipo elemento : coleccion)
        // Recorre automáticamente cada elemento del array/colección
        // Más limpio que for clásico cuando no necesitas el índice

        System.out.println("\n=== For-each con array ===");
        String[] frutas = {"manzana", "Mango", "Fresa"};

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // ============ FOR CLÁSICO VS FOR-EACH ============
        // Usa for clásico cuando:
        // - Necesitas el índice (posición)
        // - Quieres modificar el array
        // - Necesitas recorrer hacia atrás o saltar elementos

        // Usa for-each cuando:
        // - Solo necesitas leer cada elemento
        // - No te importa la posición
    }
}
