import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        // ============ CONDICIONALES IF/ELSE ============
        // Permiten ejecutar código según una condición (true o false)

        Scanner sc = new Scanner(System.in);
        int calificacion;
        System.out.println("Ingrese su calificacion del 1 - 100 ");
        calificacion = sc.nextInt();

        // ============ VALIDACIÓN CON RETURN TEMPRANO ============
        // || (OR): si CUALQUIERA de las condiciones es true, entra al if
        // return: termina la ejecución del método main inmediatamente
        if (calificacion > 100 || calificacion < 1) {
            System.out.println("Error: Ingrese un numero valido");
            sc.close();
            return;  // Sale del método, no ejecuta nada más
        }

        // ============ IF - ELSE IF - ELSE ============
        // Se evalúan en orden: cuando una condición es true, ejecuta su bloque y SALTA el resto
        // && (AND): AMBAS condiciones deben ser true para entrar al if

        // TIP: Como ya validamos que calificacion está entre 1-100,
        // técnicamente no necesitas el límite superior (ej: && calificacion <= 100)
        // Pero está bien para mayor claridad

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("\n 90 - 100 : A");
        } else if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("\n 80 - 89  : B");
        } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("\n 70 - 79  : C");
        } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("\n 60 - 69  : D");
        } else {
            // else: se ejecuta si NINGUNA condición anterior fue true
            System.out.println("\n < 60     : F");
        }

        // ============ OPERADOR TERNARIO (alternativa corta) ============
        // Sintaxis: condicion ? valorSiTrue : valorSiFalse
        String estado = (calificacion >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Estado: " + estado);

        sc.close();
    }
}
