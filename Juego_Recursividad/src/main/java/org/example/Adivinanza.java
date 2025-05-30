package org.example;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main (String [] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(10) + 1;
        System.out.println("Bienvenido al juego de adivinanza");
        System.out.println("Adivina un número entre 0 y 10");

        adivinar(leer, numeroSecreto);
        leer.close();
    }

    public static void adivinar(Scanner scanner, int secreto) {
        System.out.print("Ingresa tu número: ");
        int intento = scanner.nextInt();

        if (intento == secreto) {
            System.out.println("¡Correcto! Has adivinado el número.");
        } else {
            if (intento < secreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            adivinar(scanner, secreto); // Llamada recursiva
        }
    }
}