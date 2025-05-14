package org.example;

import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingrese 3 numeros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        //Validar si son todos iguales
        if (a == b && b == c) {
            System.out.println("Los tres números son iguales: " + a);
        } else {
        //Determinar el mayor de los tres//
            int mayor;
            if (a >= b && a >= c) {
                mayor = a;
            } else if (b >= a && b >= c) {
                mayor = b;
            } else {
                mayor = c;
            }
            System.out.println("El número mayor es: " + mayor);

            // Verificar si hay números iguales
            if (a == b || a == c || b == c) {
                System.out.println("Hay números iguales:");
                if (a == b && a != c) {
                    System.out.println("El número " + a + " se repite dos veces.");
                }
                if (a == c && a != b) {
                    System.out.println("El número " + a + " se repite dos veces.");
                }
                if (b == c && b != a) {
                    System.out.println("El número " + b + " se repite dos veces.");
                }
                if (a == b && b == c) {
                    // Ya lo cubre el primer if, pero lo dejamos por claridad
                    System.out.println("Todos los números son iguales.");
                }
            } else {
                System.out.println("Todos los números son diferentes.");
            }
        }
    }
}

