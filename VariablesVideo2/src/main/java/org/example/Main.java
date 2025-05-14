package org.example;
public class Main {
    /*
    NUMEROS ENTEROS - Ocupan diferentes espacios en memoria espacio
    * int- Numeros enteros
    * log - Numeros enteros largos
    * float - Numeros floantes : Los números flotantes son un tipo de número en programación que tiene decimales
    * double - Numeros dobles : los double son números con decimales que ofrecen alta precisión y se usan cuando
    necesitas trabajar con cifras muy grandes o con muchos decimales.
    * byte - se maneja en bytes - es un tipo de dato en programación que representa un número pequeño, generalmente en
    el rango de -128 a 127 (en sistemas que usan 8 bits para representar un byte). Es uno de los tipos de datos más
    básicos y ocupa solo 8 bits de memoria, por lo que es útil cuando necesitamos trabajar con números pequeños y
    queremos ahorrar espacio de memoria.
    * char - Caracteres : representa un único carácter, como una letra, un número o un símbolo.
    * boolean - Verdadero y falso :
    * string - Cadena de textos : es uno de los tipos de datos más simples y comunes en programación. Representa solo
    dos valores posibles: true (verdadero) o false (falso). Es especialmente útil para tomar decisiones en el programa,
    ya que permite que el programa sepa si debe ejecutar o no ciertas acciones según si la condición es verdadera o falsa.
     */
    public static void main(String[] args) {
        // double variable1;
        //variable1 = 5;
        // double Resultado;
        // Resultado = variable1 / 2;
        // System.out.println("El resultado es: " + Resultado);
        // }
        short suma; // Declaración de varaible
        suma = 3 + 1;
        int resta = 8 - 17;
        long residuo = 9/2;
        float multiplicacion = 2*(15*(-2)); // se pueden utilizar parentesis para agrupar variables
        double division = 10/3.4;

        System.out.println("El resultado de la suma es: " + suma); //suma
        System.out.println("El resultado de la resta es: " + resta); //resta
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion); //multiplicacion
        System.out.println("El resultado de la division es: " + division); //Division
        System.out.println("El resultado de la residuo es: " + residuo); //modulo o residuo


    }
}

