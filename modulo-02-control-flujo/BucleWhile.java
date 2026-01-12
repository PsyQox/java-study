import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============ WHILE ============
        // Sintaxis: while (condición) { código }
        // - Evalúa la condición ANTES de cada iteración
        // - Si la condición es false desde el inicio, NO ejecuta nada
        // - IMPORTANTE: asegurar que la condición cambie, o será bucle infinito

        // Cuenta regresiva del 10 al 1
        System.out.println("=== Cuenta regresiva ===");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;  // Sin esto = bucle infinito
        }

        // ============ DO-WHILE ============
        // Sintaxis: do { código } while (condición);
        // - Ejecuta el código PRIMERO, luego evalúa la condición
        // - SIEMPRE se ejecuta al menos UNA vez
        // - Útil para menús o cuando necesitas al menos una ejecución

        // Sumar números hasta que el usuario ingrese 0
        System.out.println("\n=== Suma de números ===");
        int response;
        int sumatorio = 0;

        do {
            System.out.println("Ingrese un número (0 para terminar): ");
            response = sc.nextInt();
            sumatorio = sumatorio + response;  // También puedes usar: sumatorio += response;
        } while (response != 0);  // Nota: termina con punto y coma

        // System.err imprime en rojo (usado para errores)
        // Para salida normal usa System.out
        System.out.println("La suma de todos los numeros es: " + sumatorio);

        // ============ WHILE VS DO-WHILE ============
        // while: usa cuando puede que NO necesites ejecutar el código
        // do-while: usa cuando SIEMPRE necesitas al menos una ejecución

        sc.close();
    }
}
