// ============ CLASE QUE IMPLEMENTA LA INTERFAZ ============
// implements Repositorio: esta clase DEBE tener todos los métodos de Repositorio
// Si falta alguno, Java da error de compilación

public class UsuarioRepositorio implements Repositorio {
    private int id = 0;

    // @Override indica que estamos implementando un método de la interfaz
    @Override
    public void guardar(Object o) {
        System.out.println("Guardando objeto...");
    }

    // Este método RETORNA un Object
    // Por ahora retornamos un String simple (String es un Object)
    @Override
    public Object buscarPorId(int id) {
        // Retornamos algo para ver que funciona
        return "Usuario encontrado con id: " + id;
    }

    @Override
    public int getId() {
        return id;
    }
}
