public class Main {
    public static void main(String[] args) {

        // ============ USAR CONSTRUCTORES ============
        // Java elige automáticamente cuál constructor usar según los argumentos

        // Constructor vacío: Carro()
        // Crea objeto con valores por defecto, asignas valores después
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.year = 2020;

        // Constructor con 2 parámetros: Carro(marca, modelo)
        // Crea objeto con marca y modelo, el resto queda null/0
        Carro carro2 = new Carro("Ford", "Focus");

        // Constructor completo: Carro(marca, modelo, year, velocidad)
        // Crea objeto con todos los valores en una sola línea
        Carro carro3 = new Carro("Dodge", "RAM", 2022, 100.0);

        // ============ VENTAJAS DE CONSTRUCTORES ============
        // Sin constructor:
        //   Carro c = new Carro();
        //   c.marca = "Ford";
        //   c.modelo = "Mustang";
        //   c.year = 2020;
        //   c.velocidad = 0.0;
        //
        // Con constructor:
        //   Carro c = new Carro("Ford", "Mustang", 2020, 0.0);  // Una sola línea

        // ============ MOSTRAR INFORMACIÓN ============
        System.out.println("=== Carro 1 (constructor vacío) ===");
        carro1.mostrarInfo();

        System.out.println("\n=== Carro 2 (constructor 2 params) ===");
        carro2.mostrarInfo();

        System.out.println("\n=== Carro 3 (constructor completo) ===");
        carro3.mostrarInfo();
    }
}
