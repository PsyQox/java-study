// public: modificador de acceso - cualquier clase puede ver esta clase
// class: palabra clave para definir una clase (plantilla de objetos)
// HolaMundo: nombre de la clase (DEBE coincidir con el nombre del archivo .java)
public class HolaMundo {

    // public: la JVM necesita acceder a este método desde fuera
    // static: pertenece a la clase, no a un objeto (no necesitas hacer "new HolaMundo()")
    // void: este método no retorna ningún valor
    // main: nombre especial - es el punto de entrada del programa
    // String[] args: array de Strings con argumentos pasados por línea de comandos
    public static void main(String[] args) {
        // System.out.println() imprime texto en la consola
        System.out.println("hola mundo");
    }
}