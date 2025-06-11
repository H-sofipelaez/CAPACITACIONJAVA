import java.util.Scanner;

public class ciclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,p;
        int c = 1;
        System.out.println("Ingrese un numero: ");
        n = entrada.nextInt();

        while (c <= n) {
            p = 2*c-2;
            System.out.println(p+".");
            c++;
        }

    }
}