import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        // ============ ARRAYLIST ============
        // Lista dinámica que puede cambiar de tamaño (a diferencia de los arrays)
        // Necesita importar: java.util.ArrayList

        // ============ WRAPPER (ENVOLTORIO) ============
        // ArrayList solo trabaja con OBJETOS, no con primitivos
        // Wrapper = clase que envuelve un primitivo para convertirlo en objeto
        // int → Integer | double → Double | boolean → Boolean | char → Character
        // Java hace conversión automática (autoboxing/unboxing)

        ArrayList<Integer> numeros = new ArrayList<>();  // Lista de enteros
        ArrayList<Double> precios = new ArrayList<>();   // Lista de decimales

        // ============ AGREGAR ELEMENTOS ============
        // add(elemento): agrega al final de la lista
        numeros.add(1);   // [1]
        numeros.add(21);  // [1, 21]
        numeros.add(20);  // [1, 21, 20]

        // set(indice, elemento): reemplaza el elemento en esa posición
        numeros.set(0, 10);  // [10, 21, 20] - cambió 1 por 10

        // ============ RECORRER CON FOR CLÁSICO ============
        // Usa size() para el tamaño y get(i) para acceder
        System.out.println("=== For clásico ===");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // ============ RECORRER CON FOR-EACH ============
        // Más limpio cuando no necesitas el índice
        System.out.println("\n=== For-each ===");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // ============ MÉTODOS DE INFORMACIÓN ============
        System.out.println("\n=== Información ===");
        System.out.println("Tamaño: " + numeros.size());        // 3
        System.out.println("Elemento [0]: " + numeros.get(0));  // 10
        System.out.println("Elemento [1]: " + numeros.get(1));  // 21
        System.out.println("Elemento [2]: " + numeros.get(2));  // 20

        // ============ ELIMINAR ELEMENTOS ============
        // remove(indice): elimina por posición
        // remove(objeto): elimina la PRIMERA OCURRENCIA del objeto
        //   (si hay duplicados, solo elimina el primero que encuentra)

        System.out.println("\n=== Eliminar ===");
        numeros.remove(0);  // Elimina el elemento en índice 0
        System.out.println("Después de remove(0): " + numeros.get(0));  // 21 (se recorrió)

        // ============ MÉTODOS DE BÚSQUEDA ============
        System.out.println("\n=== Búsqueda ===");
        System.out.println("Tamaño actual: " + numeros.size());      // 2
        System.out.println("¿Contiene 21? " + numeros.contains(21)); // true
        System.out.println("¿Está vacío? " + numeros.isEmpty());     // false
        System.out.println("Índice de 20: " + numeros.indexOf(20));  // 1

        // clear(): elimina TODOS los elementos
        numeros.clear();
        System.out.println("\nDespués de clear():");
        System.out.println("Tamaño: " + numeros.size());        // 0
        System.out.println("¿Está vacío? " + numeros.isEmpty()); // true

        // ============ ARRAYLIST DE STRINGS ============
        System.out.println("\n=== ArrayList de Strings ===");
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luis");
        nombres.add("pepe");
        nombres.add("picoro");

        // add(indice, elemento): inserta en posición específica (desplaza los demás)
        nombres.add(1, "lalo");  // Inserta "lalo" en posición 1, "pepe" pasa a posición 2

        System.out.println("Tamaño: " + nombres.size());  // 4

        for (String nombre : nombres) {
            System.out.println(nombre);  // Luis, lalo, pepe, picoro
        }

        // remove(objeto): elimina primera ocurrencia
        nombres.remove("pepe");
        System.out.println("\n¿Contiene 'Luis'? " + nombres.contains("Luis"));  // true

        // ============ ARRAY VS ARRAYLIST ============
        // Array: tamaño FIJO, más rápido, usa [] para acceder
        // ArrayList: tamaño DINÁMICO, más flexible, usa get()/set()
    }
}
