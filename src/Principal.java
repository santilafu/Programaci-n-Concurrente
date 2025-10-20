// Importamos librerías necesarias para manejar archivos y errores
import java.io.*;

public class Principal {
    public static void main(String[] args) {
        try {
            // Ruta donde están los archivos .class
            String ruta = "C:\\Users\\Santiago\\Desktop\\Curso 2º DAM\\Programacion multiproceso\\Tema 1\\Ejercicio6\\out\\production\\Ejercicio6";

            // Creamos los procesos para ejecutar la clase Palabra con distintas palabras
            ProcessBuilder A1 = new ProcessBuilder("java", "-cp", ruta, "Palabra", "Proceso");
            ProcessBuilder A2 = new ProcessBuilder("java", "-cp", ruta, "Palabra", "Cocodrilo");
            ProcessBuilder A3 = new ProcessBuilder("java", "-cp", ruta, "Palabra", "Java16");

            // Redirigimos las salidas a los archivos de texto
            A1.redirectOutput(new File("palabra1.txt"));
            A2.redirectOutput(new File("palabra2.txt"));
            A3.redirectOutput(new File("palabra3.txt"));

            // Iniciamos los tres procesos
            A1.start();
            A2.start();
            A3.start();

            System.out.println("Procesos lanzados correctamente. Revisa los archivos palabra1.txt, palabra2.txt y palabra3.txt.");

        } catch (IOException e) {
            System.out.println("Error al ejecutar los procesos: " + e.getMessage());
        }
    }
}
