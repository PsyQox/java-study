/*
 * OTRA SUBCLASE DE FIGURA
 *
 * - Cada subclase implementa calcularArea() a su manera
 * - Circulo usa PI * radio * radio
 * - Rectangulo usa base * altura
 * - Esto es POLIMORFISMO: mismo método, diferente comportamiento
 */
public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(String color, double base, double altura){
        super(color); // Pasa el color al constructor de Figura
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        // Cada figura calcula su área de forma diferente
        return base * altura;
    }
}
