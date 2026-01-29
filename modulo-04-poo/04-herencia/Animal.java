// ============ HERENCIA ============
// Permite que una clase HEREDE atributos y métodos de otra clase
// Evita duplicar código - lo común va en la clase padre
//
// Terminología:
// - Clase padre / superclase: la clase que se hereda (Animal)
// - Clase hija / subclase: la clase que hereda (Perro, Gato)
// - extends: palabra clave para heredar

// ============ CLASE PADRE (SUPERCLASE) ============
public class Animal {

    // Atributos que heredarán las clases hijas
    // Sin modificador (default): accesibles en mismo paquete y clases hijas
    String nombre;
    int edad;

    // Atributo privado: solo accesible en esta clase, las hijas usan getter/setter
    private String area;

    // Constructor del padre
    // Las clases hijas lo llaman con super(...)
    public Animal(String nombre, int edad, String area) {
        this.nombre = nombre;
        this.edad = edad;
        setArea(area);  // Usa setter para validar
    }

    // Métodos que heredarán las clases hijas
    // Las hijas pueden usarlos directamente: perro.comer()
    public void comer() {
        System.out.println(this.nombre + " esta comiendo");
    }

    public void dormir() {
        System.out.println(this.nombre + " esta durmiendo");
    }

    // Getter para atributo privado
    public String getArea() {
        return area;
    }

    // Setter con validación
    public void setArea(String area) {
        String areaTrim = area.trim();
        if (areaTrim.length() <= 0) {
            System.out.println("Debe tener letras");
            return;
        } else {
            this.area = areaTrim;
        }
    }
}
