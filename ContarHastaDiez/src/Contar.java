import java.util.Scanner;

public class Contar {
    public static void main(String[] args) {
        Scanner contar = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Escribe números para sumar. Escribe 0 para terminar.");

        while (true) {
            System.out.print("Número: ");
            numero = contar.nextInt();

            if (numero == 0) {
                break;
            }

            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
    }
}
        