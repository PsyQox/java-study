public class Main {
    public static void main(String[] args) {

        // ============ HERENCIA EN ACCIÓN ============
        // Perro y Gato heredan de Animal
        // Ambos tienen: nombre, edad, area, comer(), dormir()
        // Cada uno tiene sus propios atributos y métodos adicionales

        // Crear objetos de las clases hijas
        Perro perro1 = new Perro("Jacob", 8, "Pastor aleman", "Urbana");
        Gato gato1 = new Gato("Morris", 2, "Urbana", "Naranja");

        // ============ USAR MÉTODOS HEREDADOS ============
        System.out.println("=== Métodos heredados de Animal ===");
        perro1.comer();   // Heredado de Animal
        perro1.dormir();  // Heredado de Animal
        gato1.comer();    // Heredado de Animal
        gato1.dormir();   // Heredado de Animal

        // ============ USAR MÉTODOS PROPIOS ============
        System.out.println("\n=== Métodos propios de cada clase ===");
        perro1.ladrar();   // Propio de Perro
        gato1.maullar();   // Propio de Gato

        // ============ ACCEDER A ATRIBUTOS ENCAPSULADOS ============
        System.out.println("\n=== Getters heredados ===");
        System.out.println("Área del perro: " + perro1.getArea());  // getArea() heredado
        System.out.println("Área del gato: " + gato1.getArea());    // getArea() heredado

        // ============ RESUMEN DE HERENCIA ============
        // - extends: indica que una clase hereda de otra
        // - super(): llama al constructor del padre (debe ser primera línea)
        // - super.metodo(): llama a un método del padre
        // - La hija hereda TODO lo público y protected del padre
        // - La hija NO hereda: constructores, atributos/métodos private
        // - Java solo permite herencia SIMPLE (una clase, un padre)
    }
}
