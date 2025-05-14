package org.example;

import java.util.Scanner;

public class EntradaDesdeConsola {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entrada desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar y recibir una línea de texto
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        // Solicitar y recibir un número entero
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años.");

        // Solicitar y recibir un número decimal
        System.out.print("Ingrese su altura en metros: ");
        float altura = (float) scanner.nextDouble();
        System.out.println("Tu altura es " + altura + " metros.");
        System.out.println("Tu nombre es " + nombre + " tienes " + edad + " años y mides " + altura + " metros");

        // Cerrar el Scanner después de usarlo
        scanner.close();
    }
}
