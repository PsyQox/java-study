// import: trae clases de otros paquetes para poder usarlas
// java.util.Scanner: clase para leer entrada del usuario
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {

        // ============ CREAR SCANNER ============
        // Scanner: clase que permite leer datos desde el teclado (System.in) o archivos
        Scanner sc = new Scanner(System.in);

        // ============ MÉTODOS DE LECTURA ============

        // nextLine(): lee toda la línea incluyendo espacios (consume el \n)
        System.out.println("Ingrese su nombre completo: ");
        String nombre_completo = sc.nextLine();

        // next(): lee solo una palabra (hasta el primer espacio)
        // NOTA: deja el \n en el buffer
        System.out.println("Ingrese su primer nombre: ");
        String nombre = sc.next();

        // nextInt(): lee un número entero
        // NOTA: deja el \n en el buffer
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        // nextDouble(): lee un número decimal
        // NOTA: deja el \n en el buffer
        // IMPORTANTE: usa coma (,) o punto (.) según tu configuración regional
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();

        // ============ PROBLEMA COMÚN ============
        // Si después de nextInt/nextDouble/next quieres usar nextLine(),
        // debes consumir el \n residual:
        // sc.nextLine();  // Limpia el buffer
        // String texto = sc.nextLine();  // Ahora sí funciona

        // ============ MOSTRAR RESULTADOS ============
        System.out.println("\nResumen:");
        System.out.println("Nombre completo: " + nombre_completo);
        System.out.println("Primer nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " cm");

        // close(): libera los recursos del Scanner (buena práctica)
        sc.close();
    }
}
