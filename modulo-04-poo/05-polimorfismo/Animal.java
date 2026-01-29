// ============ POLIMORFISMO ============
// Polimorfismo = "muchas formas"
// Permite que un MISMO MÉTODO se comporte DIFERENTE según el objeto que lo ejecute
//
// Tipos:
// - Sobrescritura (Override): la hija REDEFINE un método del padre
// - Sobrecarga (Overload): mismo método con diferentes parámetros (ya lo vimos)

public class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que las clases hijas pueden SOBRESCRIBIR
    // Cada animal hará su propio sonido
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
