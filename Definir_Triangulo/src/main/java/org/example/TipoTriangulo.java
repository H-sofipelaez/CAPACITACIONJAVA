package org.example;

import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el primer lado: ");
        int lado1 = entrada.nextInt();

        System.out.print("Escribe el segundo lado: ");
        int lado2 = entrada.nextInt();

        System.out.print("Escribe el tercer lado: ");
        int lado3 = entrada.nextInt();

        // Aquí, compararemos los lados para determinar qué tipo de triángulo es
        if (lado1 == lado2 && lado2 == lado3) {  // Si todos los lados son iguales
            System.out.println("Es un triángulo EQUILAERO.");  // Imprime si es equilátero
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {  // Si al menos dos lados son iguales
            System.out.println("Es un triángulo ISÓSCELES.");  // Imprime si es isósceles
        } else {  // Si ninguno de los lados es igual.
            System.out.println("Es un triángulo ESCALENO");  // Imprime si es escaleno
        }

        entrada.close();
    }
}
