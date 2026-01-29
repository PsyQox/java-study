// ============ ENCAPSULAMIENTO ============
// Consiste en OCULTAR los datos internos de una clase y
// CONTROLAR el acceso a ellos mediante métodos (getters/setters)
//
// Beneficios:
// - Protege los datos de valores inválidos
// - Puedes cambiar la implementación interna sin afectar el código externo
// - Control total sobre cómo se leen y modifican los atributos

// ============ MODIFICADORES DE ACCESO ============
//
// | Modificador   | Misma clase | Mismo paquete | Subclase | Cualquier lugar |
// |---------------|-------------|---------------|----------|-----------------|
// | private       |     ✓       |      ✗        |    ✗     |       ✗         |
// | (default)*    |     ✓       |      ✓        |    ✗     |       ✗         |
// | protected     |     ✓       |      ✓        |    ✓     |       ✗         |
// | public        |     ✓       |      ✓        |    ✓     |       ✓         |
//
// * default = sin modificador (no escribes nada)
//
// Ejemplos:
//   private String nombre;      → Solo esta clase puede acceder
//   String apellido;            → (default) Clases del mismo paquete pueden acceder
//   protected int edad;         → Mismo paquete + clases hijas (herencia)
//   public String email;        → Cualquier clase puede acceder
//
// Buena práctica:
//   - Atributos: private (ocultar datos)
//   - Getters/Setters: public (acceso controlado)
//   - Métodos auxiliares internos: private
//   - Métodos que subclases necesitan: protected

public class Persona {

    // ============ ATRIBUTOS PRIVADOS ============
    // private: solo accesibles DENTRO de esta clase
    // Desde fuera NO puedes hacer: persona.name = "algo" (ERROR)
    private String name;
    private int edad;
    private String email;

    // ============ CONSTRUCTORES ============

    // Constructor simple
    public Persona(String name) {
        this.name = name;
    }

    // Constructor completo - USA LOS SETTERS para validar
    // IMPORTANTE: Si asignas directamente (this.edad = edad), NO se valida
    // Por eso usamos setEdad() y setEmail() para que aplique la validación
    public Persona(String name, int edad, String email) {
        this.name = name;
        setEdad(edad);    // Usa setter → valida que no sea negativa
        setEmail(email);  // Usa setter → valida que contenga @
    }

    // ============ GETTERS ============
    // Permiten LEER el valor de un atributo privado
    // Convención: getNombreAtributo()
    // Para boolean: isNombreAtributo()

    // NOTA sobre this: En getters NO necesitas "this" porque no hay ambigüedad
    // Solo existe UN "name" en este contexto (el atributo)
    public String getName() {
        return name;  // Equivalente a: return this.name;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    // ============ SETTERS ============
    // Permiten ESCRIBIR/MODIFICAR el valor de un atributo privado
    // Convención: void setNombreAtributo(tipo valor)
    // Aquí es donde pones las VALIDACIONES

    // NOTA sobre this: En setters SÍ necesitas "this" cuando el parámetro
    // tiene el MISMO NOMBRE que el atributo (hay ambigüedad)
    // - this.edad → atributo de la clase
    // - edad → parámetro del método

    public void setEdad(int edad) {
        // Validación: edad no puede ser negativa
        if (edad < 0) {
            System.out.println("No puede ser negativa");
            return;  // No modifica nada
        } else {
            this.edad = edad;  // this.edad = atributo, edad = parámetro
        }
    }

    public void setEmail(String email) {
        // Validación: email debe contener @
        if (!email.contains("@")) {
            System.out.println("Debe ser válido, no tiene @");
            return;
        } else {
            this.email = email;
        }
    }

    // ============ RESUMEN DE this ============
    // - this.atributo → siempre se refiere al atributo de la clase
    // - Si NO hay ambigüedad (no hay parámetro con el mismo nombre) → this es opcional
    // - Si SÍ hay ambigüedad (parámetro con mismo nombre) → this es OBLIGATORIO
}
