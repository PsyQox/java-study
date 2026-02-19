public class Main {
    public static void main(String[] args) {
        /*
         * ABSTRACCIÓN
         *
         * - Ocultar los detalles de implementación y mostrar solo lo esencial
         * - Define QUÉ debe hacer algo, pero no CÓMO lo hace
         * - El "cómo" lo decide cada subclase
         *
         * CLASE ABSTRACTA
         *
         * - No se puede instanciar (new Figura() da error)
         * - Sirve como plantilla para otras clases
         * - Puede tener métodos abstractos (sin cuerpo) que las subclases DEBEN implementar
         * - Puede tener métodos normales (con cuerpo) que se heredan tal cual
         */

        // Esto SÍ funciona - Circulo es una clase concreta (no abstracta)
        Circulo circulo = new Circulo("Amarrillo", 4.1);

        // getColor() viene de Figura (método normal heredado)
        System.out.println("Color del circulo: " + circulo.getColor());
        // calcularArea() está implementado en Circulo
        System.out.println("Area del Circulo: " + circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo("Verde", 4, 2.1);

        System.out.println("Color del Rectangulo: " + rectangulo.getColor());
        System.out.println("Area del Rectangulo: " + rectangulo.calcularArea());

        // ESTO NO FUNCIONA - descomenta para ver el error:
        // Figura figura = new Figura("Rojo");
        // Error: Cannot instantiate the type Figura
        // Porque Figura es abstracta, no se puede crear instancias de ella
    }
}
