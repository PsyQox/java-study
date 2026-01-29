public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    // ============ SOBRESCRITURA (@Override) ============
    // @Override: indica que estamos REDEFINIENDO un método del padre
    // Es opcional pero MUY RECOMENDADO porque:
    // - Ayuda a detectar errores (si el método no existe en el padre, marca error)
    // - Hace el código más legible
    //
    // Reglas:
    // - Mismo nombre y parámetros que el padre
    // - Tipo de retorno igual o más específico
    // - Acceso igual o MENOS restrictivo (no puedes hacer private si era public)

    @Override
    public void hacerSonido() {
        System.out.println("Perro: Guau!!!");
    }

    // TIP: Si quieres ejecutar TAMBIÉN el método del padre:
    // @Override
    // public void hacerSonido() {
    //     super.hacerSonido();  // Ejecuta el del padre primero
    //     System.out.println("Perro: Guau!!!");
    // }
}
