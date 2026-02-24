public class Main{
    public static void main(String[] args) {
        /*
         * TRY-CATCH-FINALLY
         *
         * try {
         *     // Código que puede fallar
         * } catch (TipoExcepcion e) {
         *     // Qué hacer si falla
         * } finally {
         *     // Se ejecuta SIEMPRE, falle o no (opcional)
         * }
         *
         * - "e" es el objeto de la excepción, contiene info del error
         * - e.getMessage() devuelve el mensaje de error
         * - Puedes tener múltiples catch para diferentes tipos de excepciones
         * - El orden importa: de más específico a más general
         */
        try {
            int[] numeros = {1,2,3};
            // System.out.println("Array posicion 10: " + numeros[10]);
            System.out.println("Operacion: " + (1/0));
        } catch (ArrayIndexOutOfBoundsException e) {
            // Se ejecuta si intentas acceder a un índice que no existe en el array
            System.out.println("Esa posicion no existe: " + e.getMessage());
        } catch(ArithmeticException e){
            // Se ejecuta si hay error matemático (como dividir entre 0)
            System.out.println("No se puede hacer esta operacion: " + e.getMessage());
        } finally {
            // SIEMPRE se ejecuta, haya error o no
            // Útil para cerrar archivos, conexiones a BD, liberar recursos
            System.out.println("fin del programa");
        }

        /*
         * NOTA: Solo UN catch se ejecuta (el primero que coincida)
         * Si descomentaras la línea del array, entraría en ArrayIndexOutOfBoundsException
         * y NO entraría en ArithmeticException aunque también haya división por cero
         *
         * Prueba: descomenta la línea del array y comenta la división para ver el otro catch
         */
    }
}