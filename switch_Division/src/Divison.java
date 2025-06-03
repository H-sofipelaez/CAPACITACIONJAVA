import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero para dividir");
        int numero = valor.nextInt();

        int residuo3 = numero % 3;
        int residuo5 = numero % 5;

        String clave = "";
        if (residuo3 == 0) clave += "3";
        if (residuo5 == 0) clave += "5";

        switch (clave){
            case "3" -> System.out.println("Es divisible por 3");
            case "5" -> System.out.println("Es divisible por 5");
            case "35" -> System.out.println("Es divisible por 3 y 5");
            default -> System.out.println("No es divisible por 3 ni por 5");
        }
    }
}

