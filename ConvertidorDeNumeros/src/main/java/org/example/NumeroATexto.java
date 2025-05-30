package org.example;
import java.util.Scanner;

import java.util.Scanner;

public class NumeroATexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 5
        System.out.print("Ingresa un número entre 1 y 5: ");
        int numero = scanner.nextInt();

        // Convertir el número a texto
        if (numero == 1) {
            System.out.println("uno");
        } else if (numero == 2) {
            System.out.println("dos");
        } else if (numero == 3) {
            System.out.println("tres");
        } else if (numero == 4) {
            System.out.println("cuatro");
        } else if (numero == 5) {
            System.out.println("cinco");
        } else {
            System.out.println("Número fuera de rango.");
        }

        scanner.close();
    }
}
