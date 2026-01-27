// ============ CLASE ============
// Una clase es una PLANTILLA/MOLDE para crear objetos
// Define qué ATRIBUTOS (datos) y MÉTODOS (comportamiento) tendrán los objetos
// Convención: nombre de clase en PascalCase (primera letra mayúscula)

public class Carro {

    // ============ ATRIBUTOS ============
    // Variables que pertenecen a cada objeto (características)
    // Cada objeto tendrá su propia copia de estos valores
    // Sin modificador = acceso "default" (solo dentro del mismo paquete)

    String marca;
    String modelo;
    int year;
    Double velocidad;  // Double (wrapper) en lugar de double (primitivo)

    // ============ MÉTODOS ============
    // Funciones que pertenecen al objeto (comportamiento)
    // No son static: necesitan un objeto para ejecutarse
    // Pueden acceder y modificar los atributos del objeto

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

    // Constructor vacío: inicializa valores por defecto
    public Carro() {
        this.velocidad = 0.0;
    }

    // Constructor con 2 parámetros: solo marca y modelo
    // this.atributo = distingue el atributo del parámetro cuando tienen el mismo nombre
    public Carro(String marca, String modelo) {
        this.marca = marca;    // this.marca = atributo, marca = parámetro
        this.modelo = modelo;
    }

    // Constructor completo: todos los atributos
    public Carro(String marca, String modelo, int year, Double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidad = velocidad;
    }

    void acelerar() {
        velocidad = velocidad + 10;  // Modifica el atributo del objeto
        System.out.println("La velocidad ha sido aumentada en 10. Velocidad actual: " + velocidad);
    }

    void frenar() {
        velocidad = velocidad - 10;
        if (velocidad < 0) {
            velocidad = 0.0;  // Validación: velocidad mínima es 0
        }
        System.out.println("La velocidad ha sido disminuida en 10 (minimo 0). Velocidad actual: " + velocidad);
    }

    void mostrarInfo() {
        // Accede a los atributos del objeto que llame este método
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El año es: " + year);
        System.out.println("La velocidad es: " + velocidad);
    }
}
