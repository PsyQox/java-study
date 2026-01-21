public class Main {
    public static void main(String[] args) {

        // ============ CREAR OBJETOS (INSTANCIAR) ============
        // new Carro() crea un nuevo objeto en memoria usando la clase como plantilla
        // Cada objeto es INDEPENDIENTE, tiene sus propios valores de atributos
        // Sintaxis: Clase nombreVariable = new Clase();

        Carro carro = new Carro();   // Objeto 1
        Carro carro2 = new Carro();  // Objeto 2 (independiente del primero)

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
