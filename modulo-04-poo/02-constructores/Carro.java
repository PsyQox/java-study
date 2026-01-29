// ============ CONSTRUCTORES ============
// Constructor: método especial que se ejecuta automáticamente al crear un objeto con new
// Sirve para inicializar los atributos del objeto
//
// Características:
// - Tiene el MISMO NOMBRE que la clase
// - NO tiene tipo de retorno (ni siquiera void)
// - Se ejecuta AUTOMÁTICAMENTE al hacer new
// - Si no creas ninguno, Java crea uno vacío por defecto
// - Puedes tener MÚLTIPLES constructores (sobrecarga)

public class Carro {

    // Atributos (deben declararse FUERA del constructor)
    // Son la "memoria permanente" del objeto
    String marca;
    String modelo;
    int year;
    Double velocidad;

    // ============ CONSTRUCTOR VACÍO ============
    // Se usa cuando quieres crear el objeto y asignar valores después
    // Inicializa valores por defecto
    public Carro() {
        this.velocidad = 0.0;
    }

    // ============ CONSTRUCTOR CON PARÁMETROS ============
    // Permite crear el objeto con valores iniciales
    // this.atributo = distingue el atributo del parámetro cuando tienen el mismo nombre
    public Carro(String marca, String modelo) {
        this.marca = marca;    // this.marca = atributo de la clase
        this.modelo = modelo;  // marca = parámetro del constructor
    }

    // ============ CONSTRUCTOR COMPLETO ============
    // Recibe todos los atributos
    public Carro(String marca, String modelo, int year, Double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidad = velocidad;
    }

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Velocidad: " + velocidad);
    }
}
