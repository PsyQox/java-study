public class Operadores {
    public static void main(String[] args) {

        // ============ OPERADORES ARITMÉTICOS ============

        int a = 10;
        int b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma: a + b = " + (a + b));           // 13
        System.out.println("Resta: a - b = " + (a - b));          // 7
        System.out.println("Multiplicación: a * b = " + (a * b)); // 30
        System.out.println("División entera: a / b = " + (a / b)); // 3 (trunca decimales)
        System.out.println("Módulo (residuo): a % b = " + (a % b)); // 1

        // División con decimales vs enteros
        System.out.println("\n--- División: enteros vs decimales ---");
        System.out.println("5 / 2 = " + (5 / 2));       // 2 (división entera)
        System.out.println("5.0 / 2 = " + (5.0 / 2));   // 2.5 (división decimal)

        // ============ OPERADORES DE ASIGNACIÓN ============

        System.out.println("\n--- Operadores de asignación ---");
        int x = 10;
        System.out.println("x inicial: " + x);

        x += 5;  // x = x + 5
        System.out.println("x += 5: " + x);  // 15

        x -= 3;  // x = x - 3
        System.out.println("x -= 3: " + x);  // 12

        x *= 2;  // x = x * 2
        System.out.println("x *= 2: " + x);  // 24

        x /= 4;  // x = x / 4
        System.out.println("x /= 4: " + x);  // 6

        x %= 4;  // x = x % 4
        System.out.println("x %= 4: " + x);  // 2

        // ============ OPERADORES DE COMPARACIÓN ============
        // Todos devuelven boolean (true o false)

        System.out.println("\n--- Operadores de comparación ---");
        int m = 5, n = 8;
        System.out.println("m = " + m + ", n = " + n);

        System.out.println("m == n: " + (m == n));  // false (igual a)
        System.out.println("m != n: " + (m != n));  // true (diferente de)
        System.out.println("m > n: " + (m > n));    // false (mayor que)
        System.out.println("m < n: " + (m < n));    // true (menor que)
        System.out.println("m >= 5: " + (m >= 5));  // true (mayor o igual)
        System.out.println("m <= 4: " + (m <= 4));  // false (menor o igual)

        // ============ OPERADORES LÓGICOS ============

        System.out.println("\n--- Operadores lógicos ---");
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);

        // AND (&&): ambos deben ser true
        System.out.println("p && q: " + (p && q));  // false

        // OR (||): al menos uno debe ser true
        System.out.println("p || q: " + (p || q));  // true

        // NOT (!): invierte el valor
        System.out.println("!p: " + (!p));  // false
        System.out.println("!q: " + (!q));  // true

        // ============ INCREMENTO Y DECREMENTO ============

        System.out.println("\n--- Incremento y decremento ---");
        int i = 5;
        System.out.println("i inicial: " + i);

        // Post-incremento: usa el valor y LUEGO incrementa
        System.out.println("i++: " + (i++));  // Imprime 5
        System.out.println("i después: " + i); // Ahora i = 6

        // Pre-incremento: incrementa PRIMERO y luego usa el valor
        System.out.println("++i: " + (++i));  // Incrementa a 7, imprime 7

        // Lo mismo aplica para decremento
        System.out.println("i--: " + (i--));  // Imprime 7, luego i = 6
        System.out.println("--i: " + (--i));  // Decrementa a 5, imprime 5
    }
}
