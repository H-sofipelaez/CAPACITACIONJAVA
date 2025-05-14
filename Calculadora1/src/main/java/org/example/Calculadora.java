package org.example;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar dos números al usuario
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            // Mostrar el menú de operaciones
            System.out.println("\nSeleccione la operación que desea realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            // Leer la opción seleccionada
            int opcion = scanner.nextInt();

            // Realizar la operación seleccionada utilizando if-else if encadenados
            if (opcion == 1) {
                System.out.println("Resultado de la suma: " + (numero1 + numero2));
            } else if (opcion == 2) {
                System.out.println("Resultado de la resta: " + (numero1 - numero2));
            } else if (opcion == 3) {
                System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
            } else if (opcion == 4) {
                if (numero2 != 0) {
                    System.out.println("Resultado de la división: " + (numero1 / numero2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: Se ha producido una entrada no válida. Asegúrese de ingresar números y " +
                    "opciones correctas.");
        } finally {
            scanner.close();
        }
    }
}
