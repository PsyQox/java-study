public class Metodos {

    // ============ MÉTODO MAIN ============
    // Punto de entrada del programa - aquí llamamos a nuestros métodos

    public static void main(String[] args) {
        // Métodos: Bloques de código reutilizables que realizan una tarea específica

        // Llamar método void (no retorna nada, solo ejecuta)
        line();

        // Llamar método que retorna String
        System.out.println(saludo("Luis"));
        line();

        // Llamar método que retorna double
        System.out.println("El area del rectangulo que tiene base de 2cm y altura de 4.5 cm es: " + rectanguloArea(2, 4.5));
        line();

        // Llamar método que retorna boolean
        // TIP: isPar(6) ya es boolean, no necesitas comparar con == true
        // Puedes escribir: isPar(6) ? "Si es par." : "No es par"
        String isParText = (isPar(6) == true) ? "Si es par." : "No es par";
        System.out.println("¿El numero 6 es par? " + isParText);
        line();


        // SOBRECARGA DE METODOS: Permite tener multiples metodos con el mismo nombre pero con diferentes parametros
        System.out.println(saludo());
        System.out.println(saludo("Luis", 24));
        line();
        System.out.println("El cuadrado con los lados de 5 cm, tiene un area de: " + rectanguloArea(5));

    }

    // ============ MÉTODOS PERSONALIZADOS ============

    // MÉTODO VOID: no retorna nada, solo ejecuta una acción
    // Se usa cuando solo quieres hacer algo (imprimir, modificar, etc.)
    public static void line() {
        System.out.println("========");
    }

    // MÉTODO CON RETORNO: devuelve un valor del tipo especificado
    // String nombre = parámetro que recibe el método
    // return = devuelve el valor al lugar donde se llamó
    public static String saludo(String nombre) {
        return "Hola " + nombre;
    }

    // ============ SOBRECARGA DE MÉTODOS (OVERLOADING) ============
    // Mismo nombre, diferentes parámetros
    // Java elige automáticamente cuál usar según los argumentos que le pases
    // Requisitos: debe cambiar cantidad, tipo u orden de parámetros
    // NO es válido solo cambiar el tipo de retorno

    // saludo() - sin parámetros
    public static String saludo() {
        return "Hola";
    }

    // saludo(String, int) - con nombre y edad
    public static String saludo(String nombre, int edad) {
        return "Hola " + nombre + ", tu edad es " + edad + " años.";
    }

    // MÉTODO CON MÚLTIPLES PARÁMETROS
    // Puede recibir varios parámetros separados por coma
    public static double rectanguloArea(double base, double altura) {
        return base * altura;
    }

    // rectanguloArea(double) - sobrecarga para cuadrados
    // Un solo parámetro = Java sabe que es esta versión
    public static double rectanguloArea(double lado) {
        return lado * lado;
    }

    // MÉTODO QUE RETORNA BOOLEAN
    // Útil para validaciones y condiciones
    public static boolean isPar(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
        // TIP: Se puede simplificar a una sola línea:
        // return (number % 2) == 0;
    }

    // ============ NOTAS SOBRE MÉTODOS ============
    // - public: accesible desde cualquier lugar
    // - static: pertenece a la clase (se puede llamar sin crear objeto)
    // - El tipo antes del nombre indica qué retorna (void = nada)
    // - Los parámetros van entre paréntesis (tipo nombre)
    // - return termina el método y devuelve el valor
}
