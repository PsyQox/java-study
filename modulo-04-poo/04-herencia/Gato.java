// ============ OTRA CLASE HIJA ============
// Gato también hereda de Animal
// Comparte la misma estructura base que Perro (nombre, edad, comer, dormir)
// Pero tiene sus propios atributos y métodos específicos

public class Gato extends Animal {

    // Atributo PROPIO de Gato
    String color;

    // Constructor: llama a super() y asigna atributos propios
    public Gato(String nombre, int edad, String area, String color) {
        super(nombre, edad, area);  // Llama al constructor de Animal
        this.color = color;
    }

    // Método PROPIO de Gato
    public void maullar() {
        System.out.println("El gato " + nombre + " hace miau!");
    }
}
