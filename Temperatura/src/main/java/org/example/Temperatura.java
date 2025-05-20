package org.example;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convertidor de Temperatura");
        System.out.println("Selecciona la unidad inicial:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Ingresa 1 o 2 según la conversión que desees hacer: ");

        int opcion = scanner.nextInt();


        if (opcion == 1) {
            System.out.print("Ingresa la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        } else if (opcion == 2) {
            System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
        } else {
            System.out.println("Opción no válida. Por favor ejecuta el programa nuevamente.");
        }
    }
}