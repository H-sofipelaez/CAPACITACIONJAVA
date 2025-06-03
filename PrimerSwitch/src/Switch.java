import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int Diasemana; // variable tipo entero
        Scanner entrada = new Scanner(System.in);// objecto llamdo entrada

        //ingresando datos
        System.out.println("Ingrese dia a consultar");
        Diasemana = entrada.nextInt(); // pasar lo que el usuario escribio

        //Escribir el Switch
        switch (Diasemana) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Numero incorrecto, Saliendo del sistema");
                break;

        }
    }
}