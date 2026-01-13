public class Arrays {

    // ============ ARRAYS ============
    // Array: Colección de elementos del mismo tipo con tamaño FIJO
    // Una vez creado, NO puedes cambiar su tamaño

    public static void main(String[] args) {

        // ============ FORMAS DE CREAR ARRAYS ============

        // Forma 1: Solo tamaño (valores por defecto: 0 para int)
        int[] numeros1 = new int[5];  // [0, 0, 0, 0, 0]

        // Forma 2: Con valores directamente (Java calcula el tamaño)
        int[] numeros = {1, 2, 3, 4, 5};

        // Forma 3: Declarar y luego inicializar (debe estar dentro de un método)
        int[] numeros2;
        numeros2 = new int[]{10, 20, 30};

        // NOTA: new int[5]{1,2,3,4,5} NO funciona
        // Si das valores, Java calcula el tamaño automáticamente
        // No puedes especificar ambos

        // ============ ACCEDER A ELEMENTOS ============
        // Los índices empiezan en 0

        System.out.println("=== Acceder a elementos ===");
        System.out.println("Primer elemento [0]: " + numeros[0]);
        System.out.println("Último elemento [length-1]: " + numeros[numeros.length - 1]);

        // ============ MODIFICAR ELEMENTOS ============

        System.out.println("\n=== Modificar elemento del medio ===");
        System.out.println("Antes: numeros[2] = " + numeros[2]);
        numeros[2] = 6;  // Cambia el valor en índice 2
        System.out.println("Después: numeros[2] = " + numeros[2]);

        // ============ RECORRER CON FOR CLÁSICO ============
        // Útil cuando necesitas el índice

        System.out.println("\n=== For clásico (con índice) ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " → valor: " + numeros[i]);
        }

        // ============ RECORRER CON FOR-EACH ============
        // Más limpio cuando solo necesitas los valores

        System.out.println("\n=== For-each (solo valores) ===");
        int suma = 0;
        for (int numero : numeros) {
            System.out.println(numero);
            suma += numero;  // suma = suma + numero
        }

        // ============ RESULTADO ============
        System.out.println("\nLa suma de todos los elementos es: " + suma);

        // ============ NOTAS IMPORTANTES ============
        // - Índices van de 0 a length-1
        // - Acceder a índice fuera de rango = ArrayIndexOutOfBoundsException
        // - length es una PROPIEDAD, no método (sin paréntesis)
        // - El tamaño es FIJO, para tamaño dinámico usa ArrayList
    }
}

