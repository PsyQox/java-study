public class BreakContinue {
    public static void main(String[] args) {

        // ============ BREAK ============
        // Termina el bucle COMPLETAMENTE y sale de él
        // Útil para buscar algo y detenerse al encontrarlo

        // Buscar el primer múltiplo de 7 entre 1-100
        System.out.println("=== Break ===");
        for (int i = 1; i <= 100; i++) {
            if ((i % 7) == 0) {
                System.out.println("El primer multiplo de 7 es: " + i);
                break;  // Sale del bucle, no sigue buscando
            }
        }
        // Sin break, encontraría TODOS los múltiplos: 7, 14, 21, 28...

        // ============ CONTINUE ============
        // Salta a la SIGUIENTE ITERACIÓN, omitiendo el código restante de esa vuelta
        // Útil para omitir ciertos valores sin salir del bucle

        // Imprimir 1-10 saltando el 5 y el 7
        System.out.println("\n=== Continue ===");
        for (int x = 1; x <= 10; x++) {
            if (x == 5 || x == 7) {
                continue;  // Salta esta iteración, va directamente a x++
            }
            // Este código NO se ejecuta cuando x es 5 o 7
            System.out.println(x);
        }
        // Imprime: 1, 2, 3, 4, 6, 8, 9, 10

        // TIP: El else no es necesario porque continue salta el resto del código
        // for (int x = 1; x <= 10; x++) {
        //     if (x == 5 || x == 7) continue;
        //     System.out.println(x);
        // }

        // ============ RESUMEN ============
        // break: SALE del bucle completamente
        // continue: SALTA a la siguiente iteración
    }
}
