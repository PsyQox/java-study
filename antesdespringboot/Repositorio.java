// ============ INTERFACES ============
// Una interfaz es un CONTRATO: define QUÉ métodos debe tener una clase,
// pero NO cómo implementarlos (solo la firma, sin código)
//
// Palabras clave:
// - interface: para definir el contrato
// - implements: para que una clase cumpla el contrato

public interface Repositorio {
    // Solo firmas de métodos (sin código)
    // Las clases que implementen esta interfaz DEBEN tener estos métodos

    void guardar(Object o);
    Object buscarPorId(int id);
    int getId();
}
