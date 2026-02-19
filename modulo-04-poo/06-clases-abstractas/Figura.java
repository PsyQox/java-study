/*
 * CLASE ABSTRACTA
 *
 * - Se declara con la palabra "abstract" antes de "class"
 * - NO se puede instanciar directamente (no puedes hacer new Figura())
 * - Sirve como plantilla/molde para que otras clases hereden de ella
 * - Puede tener métodos normales (con cuerpo) y métodos abstractos (sin cuerpo)
 *
 * ¿Cuándo usar una clase abstracta?
 * - Cuando tienes código común que quieres compartir entre varias clases
 * - Cuando quieres obligar a las subclases a implementar ciertos métodos
 * - Cuando no tiene sentido crear instancias de la clase padre (ej: "Figura" genérica)
 */
public abstract class Figura {
    String color;

    // Constructor normal - las clases abstractas SÍ pueden tener constructores
    // Se usan cuando las subclases llaman a super()
    public Figura(String color){
        this.color = color;
    }

    /*
     * MÉTODO ABSTRACTO
     *
     * - Se declara con "abstract" y NO tiene cuerpo (termina en punto y coma)
     * - Las subclases están OBLIGADAS a implementarlo
     * - Si no lo implementan, Java da error de compilación
     * - Define QUÉ debe hacer, pero no CÓMO (el cómo lo decide cada subclase)
     */
    public abstract double calcularArea();

    // Método normal - tiene cuerpo y se hereda tal cual a las subclases
    public String getColor(){
        return color;
    }
}
