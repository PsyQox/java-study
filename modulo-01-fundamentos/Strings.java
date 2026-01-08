public class Strings {
    public static void main(String[] args) {

        // ============ CREAR STRINGS ============
        // String es una clase (no primitivo), por eso se escribe con mayúscula

        String s1 = "hola";                     // Forma común (literal)
        String s2 = new String("hola 2");       // Con constructor (menos eficiente)
        String text = "Hola";

        // ============ MÉTODOS DE INFORMACIÓN ============

        // length(): devuelve la longitud del string
        System.out.println("length() de 'Hola': " + "Hola".length());  // 4
        System.out.println("length() de text: " + text.length());       // 4

        // charAt(i): devuelve el carácter en la posición i (empieza en 0)
        System.out.println("charAt(0): " + text.charAt(0));  // H

        // indexOf(str): devuelve la posición de str (-1 si no existe)
        System.out.println("indexOf('a'): " + text.indexOf("a"));  // 3
        System.out.println("indexOf('z'): " + text.indexOf("z"));  // -1 (no existe)

        // ============ MÉTODOS DE TRANSFORMACIÓN ============
        // Nota: los Strings son INMUTABLES, estos métodos devuelven un NUEVO string

        // toUpperCase(): convierte a mayúsculas
        System.out.println("toUpperCase(): " + text.toUpperCase());  // HOLA

        // toLowerCase(): convierte a minúsculas
        System.out.println("toLowerCase(): " + text.toLowerCase());  // hola

        // substring(inicio, fin): extrae desde inicio hasta fin-1
        System.out.println("substring(0, 2): " + text.substring(0, 2));  // Ho

        // replace(viejo, nuevo): reemplaza caracteres o cadenas
        System.out.println("replace('a', '4'): " + text.replace("a", "4"));  // Hol4

        // trim(): elimina espacios al inicio y al final
        String conEspacios = "   Hola Mundo   ";
        System.out.println("trim(): '" + conEspacios.trim() + "'");  // 'Hola Mundo'

        // concat(): concatena strings (alternativa a +)
        System.out.println("concat(): " + "Hola".concat(" Mundo"));  // Hola Mundo

        // ============ MÉTODOS DE BÚSQUEDA (devuelven boolean) ============

        // contains(str): verifica si contiene str
        System.out.println("contains('H'): " + text.contains("H"));  // true

        // startsWith(str): verifica si empieza con str
        System.out.println("startsWith('Ho'): " + text.startsWith("Ho"));  // true

        // endsWith(str): verifica si termina con str
        System.out.println("endsWith('la'): " + text.endsWith("la"));  // true

        // ============ MÉTODOS DE COMPARACIÓN ============

        // equals(): compara el CONTENIDO (usar esto, NO ==)
        String a = "Hola";
        String b = "Hola";
        String c = "hola";
        System.out.println("equals('Hola'): " + a.equals(b));  // true
        System.out.println("equals('hola'): " + a.equals(c));  // false

        // equalsIgnoreCase(): compara ignorando mayúsculas/minúsculas
        System.out.println("equalsIgnoreCase('hola'): " + a.equalsIgnoreCase(c));  // true

        // ============ MÉTODOS DE VERIFICACIÓN ============

        // isEmpty(): verifica si el string está vacío (length == 0)
        System.out.println("''.isEmpty(): " + "".isEmpty());      // true
        System.out.println("' '.isEmpty(): " + " ".isEmpty());    // false (tiene espacio)

        // isBlank(): verifica si está vacío O solo tiene espacios (Java 11+)
        System.out.println("'   '.isBlank(): " + "   ".isBlank());  // true

        // ============ SPLIT (dividir string) ============

        // split(separador): divide el string en un array
        String csv = "manzana,pera,uva";
        String[] frutas = csv.split(",");
        System.out.println("split(','):");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }

        // ============ TEXT BLOCKS (Java 15+) ============
        // Permite strings multilínea sin usar \n

        String textBlock = """
                Este es un texto
                de múltiples líneas
                muy útil para JSON, SQL, HTML, etc.
                """;
        System.out.println("Text Block:");
        System.out.println(textBlock);

        // ============ COMPARAR CON == vs equals() ============

        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = new String("Hola");

        // == compara REFERENCIAS (dirección en memoria)
        // equals() compara CONTENIDO

        System.out.println("str1 == str2: " + (str1 == str2));        // true (mismo literal en pool)
        System.out.println("str1 == str3: " + (str1 == str3));        // false (diferente objeto)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (mismo contenido)
        // SIEMPRE usar equals() para comparar Strings!
    }
}
