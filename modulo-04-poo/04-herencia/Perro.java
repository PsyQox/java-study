// ============ CLASE HIJA (SUBCLASE) ============
// extends Animal: Perro HEREDA de Animal
// Perro obtiene automáticamente: nombre, edad, comer(), dormir(), getArea(), setArea()

public class Perro extends Animal {

    // Atributo PROPIO de Perro (no está en Animal)
    String raza;

    // ============ CONSTRUCTOR DE CLASE HIJA ============
    // Debe llamar al constructor del padre con super(...)
    // super() DEBE ser la PRIMERA línea del constructor
    public Perro(String nombre, int edad, String raza, String area) {
        // super(): llama al constructor de Animal(nombre, edad, area)
        // El padre se encarga de asignar nombre, edad y validar area
        super(nombre, edad, area);

        // Después de super(), asignamos los atributos propios de Perro
        this.raza = raza;
    }

    // Método PROPIO de Perro (no está en Animal)
    // Puede acceder a 'nombre' porque lo heredó de Animal
    public void ladrar() {
        System.out.println("El perro " + nombre + " de raza " + raza + " esta ladrando.");
    }

    // Perro también puede usar: comer(), dormir(), getArea(), setArea()
    // porque los heredó de Animal
}
