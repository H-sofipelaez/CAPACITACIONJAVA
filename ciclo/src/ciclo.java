import java.util.Scanner;

public class ciclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int c = 0;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();
        while (c < n) {
            System.out.println(c+".");
            c++;

        }

    }
}