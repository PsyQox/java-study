public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    // Sobrescribe hacerSonido() con comportamiento propio de Gato
    @Override
    public void hacerSonido() {
        System.out.println("Gato: Miauu!!");
    }
}
