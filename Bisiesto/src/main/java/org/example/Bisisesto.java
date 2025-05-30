package org.example;

import java.util.Scanner;

public class Bisisesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Escriba un año para verificar");
        int valor = scanner.nextInt();

        if (valor % 400 == 0) {
            System.out.println(valor + " es un año bisiesto.");
        } else if (valor  % 100 == 0) {
            System.out.println(valor + " no es un año bisiesto.");
        } else if (valor % 4 == 0) {
            System.out.println(valor + " es un año bisiesto.");
        } else {
            System.out.println(valor + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
