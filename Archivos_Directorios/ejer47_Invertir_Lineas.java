/**Escribe un programa que lea un archivo de texto línea por línea e
invierta el orden de las líneas en el archivo de salida.**/

package practice.Archivos_Directorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class ejer47_Invertir_Lineas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lineas = new ArrayList<>();

        System.out.println("Ingrese la ruta del archivo a leer");
        String ruta = input.next();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }

        System.out.println("Estas son las lineas del archivo");
        for (int i = 0; i < lineas.size(); i++){
            System.out.println(lineas.get(i));
        }

        System.out.println("Ahora las lineas en orden inverso!");
        for (int i =lineas.size() - 1 ; i >= 0 ; i--) {
            System.out.println(lineas.get(i));
        }
    }
}
