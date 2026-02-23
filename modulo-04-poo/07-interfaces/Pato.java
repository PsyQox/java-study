/*
 * CLASE QUE IMPLEMENTA MÚLTIPLES INTERFACES
 *
 * - Usa "implements" seguido de las interfaces separadas por coma
 * - DEBE implementar TODOS los métodos de TODAS las interfaces
 * - Esto es la ventaja sobre herencia: puedes "heredar" de muchas interfaces
 *
 * Comparación con herencia:
 * - class Hijo extends Padre              → solo UNA clase padre
 * - class Pato implements Volador, Nadador → MÚLTIPLES interfaces
 */
public class Pato implements Nadador, Volador {

    // Implementación del método de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }

    // Implementación del método de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }
}
