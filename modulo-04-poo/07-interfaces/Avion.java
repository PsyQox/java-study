/*
 * CLASE QUE IMPLEMENTA UNA SOLA INTERFACE
 *
 * - El Avion solo vuela, no nada
 * - Solo implementa Volador
 */
public class Avion implements Volador {

    // Nota: aquí faltaba @Override, siempre ponlo por buena práctica
    @Override
    public void volar() {
        System.out.println("El avion esta volando.");
    }
}
