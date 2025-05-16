package org.example;


import java.util.Scanner;

class Division{
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero para dividir, si es un numero menor a 1 escribirlo con comas:");
        Double numero = valor.nextDouble();

        //Residuo
        double a = numero % 3;
        System.out.println(" Residuo al dividir entre 3 " + a);
        double x5 = numero % 5;
            System.out.println(" Residuo al dividir entre 5 " + x5 );

            //Divisible
        if (a==0 && x5==0) {
            System.out.print("El número es divisible por 3 y 5");
        } else if (a == 0) {
            System.out.print("El número es divisible por 3 " );

        }else if (x5 == 0) {
            System.out.print("El número es divisible por 5 " );

        }else {
            System.out.print("El número es divisible por 3 y 5" );

        }

    }

}