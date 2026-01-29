public class Main {
    public static void main(String[] args) {

        // ============ EL PODER DEL POLIMORFISMO ============
        // Una variable de tipo PADRE puede contener objetos HIJOS
        // Animal[] puede contener: Animal, Perro, Gato, o cualquier clase que herede de Animal

        Animal[] animales = {
            new Animal("Genérico"),
            new Perro("Jacob"),
            new Gato("Morris"),
            new Perro("Hachi"),
            new Perro("Princesa")
        };

        // ============ POLIMORFISMO EN ACCIÓN ============
        // Aunque el array es de tipo Animal, cada objeto ejecuta SU PROPIA versión del método
        // Java decide en TIEMPO DE EJECUCIÓN qué método llamar (binding dinámico)

        System.out.println("=== Cada animal hace su sonido ===");
        for (Animal animal : animales) {
            animal.hacerSonido();
            // Animal → "El animal hace un sonido."
            // Perro  → "Perro: Guau!!!"
            // Gato   → "Gato: Miauu!!"
        }

        // ============ ¿POR QUÉ ES ÚTIL? ============
        // - Puedes tratar objetos diferentes de forma UNIFORME
        // - No necesitas saber el tipo exacto, solo que son "Animal"
        // - Fácil de extender: agregar Pájaro, Vaca, etc. sin cambiar este código
        //
        // Ejemplo real: un método que recibe Animal como parámetro
        // public void alimentar(Animal a) {
        //     a.hacerSonido();  // Funciona con Perro, Gato, cualquier Animal
        // }
    }
}
