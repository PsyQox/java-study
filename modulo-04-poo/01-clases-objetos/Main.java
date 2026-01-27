public class Main {
    public static void main(String[] args) {

        // ============ CREAR OBJETOS (INSTANCIAR) ============
        // new Carro() crea un nuevo objeto en memoria usando la clase como plantilla
        // Cada objeto es INDEPENDIENTE, tiene sus propios valores de atributos
        // Sintaxis: Clase nombreVariable = new Clase();

        // ============ USAR CONSTRUCTORES ============
        // Java elige el constructor según los argumentos que le pases

        // Constructor vacío: Carro()
        Carro carro = new Carro();   // velocidad = 0.0, resto = null/0
        Carro carro2 = new Carro();

        // Constructor con 2 parámetros: Carro(marca, modelo)
        Carro carro3 = new Carro("Ford", "Focus");  // marca y modelo asignados

        // Constructor completo: Carro(marca, modelo, year, velocidad)
        Carro carro4 = new Carro("Dodge", "RAM", 2020, 100.0);  // todo asignado

        // ============ ASIGNAR VALORES A ATRIBUTOS ============
        // Accedemos a los atributos con: objeto.atributo
        // Cada objeto mantiene sus propios valores

        carro.marca = "Ford";
        carro.modelo = "Mustang";
        carro.year = 1998;
        carro.velocidad = 120.0;

        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.year = 1988;
        carro2.velocidad = 110.0;

        // ============ LLAMAR MÉTODOS ============
        // Accedemos a los métodos con: objeto.metodo()
        // El método opera sobre los atributos del objeto que lo llama

        carro.mostrarInfo();  // Muestra info de carro (Ford Mustang)
        System.out.println();
        carro.acelerar();     // Aumenta velocidad de carro
        carro.frenar();       // Disminuye velocidad de carro

        System.out.println();

        carro2.mostrarInfo(); // Muestra info de carro2 (Chevrolet Camaro)
        System.out.println();
        carro2.acelerar();    // Aumenta velocidad de carro2
        carro2.frenar();      // Disminuye velocidad de carro2

        // NOTA: carro y carro2 son objetos INDEPENDIENTES
        // Modificar uno NO afecta al otro
    }
}
