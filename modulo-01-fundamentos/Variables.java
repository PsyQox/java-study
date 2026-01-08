public class Variables {
    public static void main(String[] args) {

        // ============ TIPOS PRIMITIVOS ENTEROS ============

        // byte: 8 bits | Rango: -128 a 127
        byte n = 10;

        // short: 16 bits | Rango: -32,768 a 32,767
        short n2 = 0;

        // int: 32 bits | Rango: -2,147,483,648 a 2,147,483,647 (el más usado para enteros)
        int edad = 10;

        // long: 64 bits | Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        // Nota: se agrega 'L' al final para indicar que es long
        long l = 0L;

        // ============ TIPOS PRIMITIVOS DECIMALES ============

        // float: 32 bits | ~6-7 dígitos de precisión decimal
        // Nota: se agrega 'f' al final para indicar que es float
        float f = 1.3f;

        // double: 64 bits | ~15-16 dígitos de precisión (el más usado para decimales)
        double d = 1.3;

        // ============ OTROS TIPOS PRIMITIVOS ============

        // boolean: solo puede ser true o false (verdadero o falso)
        boolean b = true;

        // char: 16 bits | Un solo carácter Unicode (se usa comillas simples '')
        char c = 'A';

        // ============ IMPRIMIR VARIABLES ============

        System.out.println("byte: " + n);
        System.out.println("short: " + n2);
        System.out.println("int - Mi edad es: " + edad);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + b);
        System.out.println("char: " + c);
    }
}
