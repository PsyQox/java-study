public class Main {
    public static void main(String[] args) {
        /*
         * INTERFACES
         *
         * - Es un CONTRATO que define qué métodos debe tener una clase
         * - No dice CÓMO implementarlos, solo QUÉ deben existir
         * - Se usa "implements" para implementar una interfaz
         * - Una clase puede implementar MÚLTIPLES interfaces
         *
         * DIFERENCIA CON CLASE ABSTRACTA:
         *
         * | Clase Abstracta          | Interface                    |
         * |--------------------------|------------------------------|
         * | extends (hereda)         | implements (implementa)      |
         * | Solo UNA                 | Puedes implementar MUCHAS    |
         * | Puede tener atributos    | Solo constantes              |
         * | Puede tener constructores| NO puede tener constructores |
         *
         * ¿Cuándo usar cada una?
         * - Clase abstracta: cuando las subclases comparten código común
         * - Interface: cuando defines un comportamiento que varias clases pueden tener
         */

        Avion avion = new Avion();
        avion.volar(); // Avion solo implementa Volador

        Pato pato = new Pato();
        pato.volar(); // Pato implementa Volador
        pato.nadar(); // Pato también implementa Nadador

        /*
         * POLIMORFISMO CON INTERFACES
         *
         * Puedes usar la interfaz como tipo, y guardar cualquier objeto que la implemente:
         */
        Volador cosaThatVuela = new Avion(); // Avion es Volador
        cosaThatVuela.volar();

        cosaThatVuela = new Pato(); // Pato también es Volador
        cosaThatVuela.volar();

        // Pero con cosaThatVuela no puedes llamar nadar() porque el tipo es Volador, no Pato
        // cosaThatVuela.nadar(); // ERROR - Volador no tiene nadar()
    }
}
