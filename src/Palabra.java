//En el método main añade el código necesario para crear un programa que escriba una
// línea en la salida estándar (System.out) por cada carácter de la palabra indicando si es letra mayúscula, letra minúscula, número u otro.
// En cada línea también se escribirá la fecha y hora del sistema.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Palabra {
    public static  void main(String[] args) throws InterruptedException {
        //Comprobamos que se haya pasado el argumento
        if (args.length == 0) {
            System.out.println("Por favor, introduce una palabra como argumento.");
            return;
        }
        //Guardamos la palabra  introducida por el usuario
        String palabra = args[0];

        //Recorremos cada carácter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            String tipo;
            //Comprobamos el tipo de carácter
            if (Character.isUpperCase(caracter)) {
                tipo = "letra mayúscula";
            } else if (Character.isLowerCase(caracter)) {
                tipo = "letra minúscula";
            } else if (Character.isDigit(caracter)) {
                tipo = "número";
            } else {
                tipo = "otro";
            }
            //Mostramos el carácter, su tipo y la fecha y hora actual
            System.out.println(LocalDateTime.now() + "----" + tipo);

            //Pausa de medio segundo (Para ver mejor la ejecucion)
            Thread.sleep(500);
        }
    }
}
