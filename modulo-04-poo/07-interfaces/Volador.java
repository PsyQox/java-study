/*
 * INTERFACE (Interfaz)
 *
 * - Se declara con "interface" en vez de "class"
 * - Es un CONTRATO: define QUÉ métodos debe tener una clase
 * - Los métodos NO tienen cuerpo (son implícitamente abstract)
 * - Los métodos son implícitamente "public abstract"
 * - No se puede instanciar (no puedes hacer new Volador())
 *
 * ¿Por qué usar interfaces?
 * - Una clase puede implementar MÚLTIPLES interfaces (pero solo heredar de UNA clase)
 * - Permite polimorfismo: tratar objetos diferentes de forma uniforme
 * - Desacopla el código: dependes del contrato, no de la implementación
 */
public interface Volador {
    // Este método es implícitamente "public abstract"
    // Las clases que implementen Volador DEBEN definir cómo volar()
    void volar();
}
