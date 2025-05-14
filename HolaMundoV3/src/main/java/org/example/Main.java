package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {  //esto es un metodo
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf(" Hola Sofia\n"); //Imprime nuevamente un salto de linea pero de una forma diferente
        System.out.println("Hola Sofia , "); //Imprime un metodo en consola junto a un salto de linea
        System.out.print("Hola Sofia"); //Este método imprime un mensaje sin añadir un salto de línea al final.
        System.out.format("hola");; //Similar a printf(), este método también permite formatear la salida
        // %d es un especificador de formato para enteros
    }
}
//Tambien hay otra forma para imprimir en consola llamada LOGGER este es para "Así, el logger es simplemente una
//forma de escribir mensajes útiles desde dentro del programa, para poder revisarlos después y entender mejor cómo
//ha funcionado o qué ha fallado."

/* import java.util.logging.Logger;
import java.util.logging.Level;

public class EjemploLogger {
    private static final Logger logger = Logger.getLogger(EjemploLogger.class.getName());

    public static void main(String[] args) {
        logger.info("Mensaje informativo");          // Mensaje de información general
        logger.warning("Advertencia");               // Mensaje de advertencia
        logger.severe("Error grave");                // Mensaje de error severo
        logger.log(Level.FINE, "Mensaje de depuración"); // Mensaje de depuración
    }
} /* //CON RESPECTO AL LOGGER EN QUE MOMENTO SE UTILIZARIA Y COMO SE IMPORTA DICHAS LIBRERIAS
O NO ES UNA LIBRERIA¿?
 */
