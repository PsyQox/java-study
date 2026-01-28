public class Main {
    public static void main(String[] args) {

        // ============ CREAR OBJETO ============
        Persona persona1 = new Persona("Luis");

        // ============ ACCESO CON ENCAPSULAMIENTO ============

        // INCORRECTO - Los atributos son private, no puedes acceder directamente
        // persona1.name = "Juan";     // ERROR: name tiene acceso private
        // persona1.edad = -50;        // ERROR: edad tiene acceso private

        // CORRECTO - Usar setters (con validación incluida)
        persona1.setEdad(10);              // OK: edad válida
        persona1.setEmail("luis@gmail.com"); // OK: tiene @

        // Probar validaciones
        System.out.println("=== Probando validaciones ===");
        persona1.setEdad(-5);              // Muestra error, no modifica
        persona1.setEmail("correo_sin_arroba"); // Muestra error, no modifica

        // ============ LEER CON GETTERS ============
        System.out.println("\n=== Datos de persona1 ===");
        System.out.println("Nombre: " + persona1.getName());
        System.out.println("Edad: " + persona1.getEdad());    // Sigue siendo 10
        System.out.println("Email: " + persona1.getEmail());  // Sigue siendo luis@gmail.com

        // ============ CONSTRUCTOR CON VALIDACIÓN ============
        System.out.println("\n=== Crear con constructor completo ===");
        Persona persona2 = new Persona("Ana", -20, "email_invalido");
        // El constructor usa setters, así que valida:
        // - edad -20 → rechazada
        // - email sin @ → rechazado

        System.out.println("Nombre: " + persona2.getName());
        System.out.println("Edad: " + persona2.getEdad());    // 0 (no se asignó)
        System.out.println("Email: " + persona2.getEmail());  // null (no se asignó)
    }
}