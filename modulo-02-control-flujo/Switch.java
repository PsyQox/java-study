import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia del 1 al 7: ");
        int numero_semana = sc.nextInt();

        // Validación temprana
        if (numero_semana < 1 || numero_semana > 7) {
            System.out.println("Error: Ingresa un numero valido");
            sc.close();
            return;
        }

        // ============ SWITCH CLÁSICO ============
        // Evalúa el valor de una variable y ejecuta el case que coincida
        // break: OBLIGATORIO para evitar "fall-through" (que siga ejecutando los siguientes casos)
        // default: se ejecuta si ningún case coincide (como el else)

        switch (numero_semana) {
            case 1:
                System.out.println("Lunes");
                break;  // Sin break, seguiría ejecutando case 2, 3, etc.
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        // ============ SWITCH EXPRESSION (Java 14+) ============
        // Forma moderna y más limpia
        // -> : no necesita break, ejecuta solo esa línea/bloque
        // Puede retornar un valor directamente (asignarlo a una variable)
        // case 1,2,3,4,5 : múltiples valores en un solo case

        String resultado = switch (numero_semana) {
            case 1, 2, 3, 4, 5 -> "Dia laboral";
            case 6, 7 -> "Fin de semana";
            default -> "Dia invalido";  // Necesario si no cubres todos los casos posibles
        };  // Nota: termina con punto y coma porque es una asignación

        System.out.println("\n" + resultado);

        sc.close();
    }
}
