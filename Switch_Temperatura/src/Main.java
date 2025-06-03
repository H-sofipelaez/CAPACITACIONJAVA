import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convertidor de Temperatura");
        System.out.println("Selecciona la unidad inicial:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Ingresa 1 o 2 según la conversión que desees hacer: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Ingresa la temperatura en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
            }
            case 2 -> {
                System.out.println("Ingresa la temperatura en grados Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = ((fahrenheit - 32) * 5) / 9;
            }
            default -> System.out.println("Opción no válida. Por favor ejecuta el programa nuevamente.");





        }
    }
}