//Crear un programa que tenga 3 opciones que se le muestra al usuario: 
//1) Crear un archivo 2) Listar archivos 0) Salir
//El programa debe capturar los posibles errores de escritura, por ejemplo,
//el colocar una letra en donde deben colocar números o que no se pueda crear el archivo solicitado.
package practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearDirectorio {
    public static void main(String[] args) {
      // Ruta del directorio que queremos crear
      String directorioPath = "C:\Users\Martina\Videos\Practice";
  
      // Crear un objeto File con la ruta especificada
      File directorio = new File(directorioPath);
  
      // Crear el directorio
      if (directorio.mkdir()) {
        System.out.println("Directorio creado exitosamente.");
      } else {
        System.out.println("Error al crear el directorio.");
      }
    }
}
public class CrearArchivo {
    public static void main(String[] args) {
      String archivoPath = "nuevo_directorio/nuevo_archivo.txt";
  
      File archivo = new File(archivoPath);
  
      try {
        if (archivo.createNewFile()) {
          System.out.println("Archivo creado exitosamente.");
        } else {
          System.out.println("Error al crear el archivo.");
        }
      } catch (IOException e) {
        System.out.println("Ocurrió un error al crear el archivo.");
        e.printStackTrace();
      }
    }
}
public class ListarArchivos {
    public static void main(String[] args) {
      String directorioPath = "nuevo_directorio";

      File directorio = new File(directorioPath);
  

      String[] lista = directorio.list();
  
      if (lista != null) {
        for (String nombre : lista) {
          System.out.println(nombre);
        }
      } else {
        System.out.println("El directorio está vacío o no existe.");
      }
    }

public class 3opciones {
    public static void main(String[] args){
        Scanner eleccion = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1) Crear un archivo");
        System.out.println("2) Listar archivos");
        System.out.println("0) Salir");
        System.out.print("Ingresa el número de la opción: ");
        Int eleccion = scanner.nextInt();
    
        switch (eleccion) {
            case 1:
                CrearArchivo();
                break;
            case 2:
                ListarArchivos();
                break;
            case 0:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
                break;
        }
    }
    
}

public class CrearDirectorioRecursivo {
    public static void main(String[] args) {
        System.out.println("Ingresa la ruta del directorio: ");
        Scanner scanner = new Scanner(System.in);
        String ruta = scanner.nextLine();

        File directorio = new File(ruta);
        boolean creado = directorio.mkdirs();

        if (creado) {
            System.out.println("Directorio creado exitosamente.");
        } else {
            System.out.println("Error al crear el directorio.");
        }
    }
}




   

