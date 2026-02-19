/*
 * SUBCLASE DE UNA CLASE ABSTRACTA
 *
 * - Usa "extends" para heredar de la clase abstracta
 * - DEBE implementar todos los métodos abstractos del padre
 * - Si no los implementa, también debe ser declarada como abstract
 */
public class Circulo extends Figura {
    double radio;

    public Circulo(String color, double radio){
        // super() llama al constructor del padre (Figura)
        // Es obligatorio porque Figura tiene un constructor con parámetro
        super(color);
        this.radio = radio;
    }

    /*
     * @Override indica que estamos implementando el método abstracto del padre
     * - Es buena práctica ponerlo siempre
     * - El compilador verifica que realmente existe ese método en el padre
     * - Si escribes mal el nombre del método, @Override te avisa del error
     */
    @Override
    public double calcularArea(){
        // Math.PI es una constante de Java con el valor de PI (3.14159...)
        return Math.PI * radio * radio;
    }
}
