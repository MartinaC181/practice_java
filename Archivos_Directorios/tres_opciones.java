//Crear un programa que tenga 3 opciones que se le muestra al usuario: 
//1) Crear un archivo 2) Listar archivos 0) Salir
//El programa debe capturar los posibles errores de escritura, por ejemplo,
//el colocar una letra en donde deben colocar números o que no se pueda crear el archivo solicitado.
package practice.Archivos_Directorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class tres_opciones {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int opcion = 0;

        System.out.println("--- MENU ---");
        System.out.println("`");
        System.out.println("1 - Crear archivo");
        System.out.println("2 - Listar archivos");
        System.out.println("3 - Salir");
        System.out.println("`");
        try {
            System.out.print("Seleccione una opción: ");
            int aux = leer.nextInt();
            opcion = aux;
        } catch (Exception e) {
            System.out.println("Solo se admiten números");
        }

        switch (opcion){

            case 1:
                System.out.println("Ingrese la extensión del archivo a crear");
                String ext=leer.next();
                System.out.println("Ahora el nombre");
                String nombre=leer.next();
                System.out.println("Ahora el destino del archivo");
                String url= leer.next();

                //Ruta del archivo que queremos crear
                String archivoPath = url+"/"+nombre+"."+ext;

                // Crear un objeto File con la ruta especificada
                File archivo = new File(archivoPath);

                try {
                    // Crear el archivo
                    archivo.createNewFile();
                        System.out.println("Archivo creado exitosamente.");
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al crear el archivo.");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("¿Qué directorio desea listar?");
                String dir=leer.next();


                // Crear un objeto File con la ruta especificada
                File directorio = new File(dir);

                // Obtener la lista de archivos y directorios
                String[] lista = directorio.list();

                if (lista != null) {
                    for (String nombres : lista) {
                        System.out.println(nombres);
                    }
                } else {
                    System.out.println("El directorio está vacío o no existe.");
                }
                break;
            case 3:
                System.out.println("Gracias vuelva prontos");
                break;
            case 4:
                System.out.println("¿Qué archivo desea eliminar?");
                String arch= leer.next();

                File archivo1 = new File(arch);
                if (archivo1.delete()) {
                    System.out.println("Archivo eliminado exitosamente.");
                } else {
                    System.out.println("Error al eliminar el archivo.");
                }
                /**try {
                    archivo1.delete();
                    System.out.println("Archivo eliminado exitosamente");
                } catch (IOException e) {
                    System.out.println("Error: no se encuentra el archivo");
                }**/
                break;
            default:
                System.out.println("Opción no válida");
                break;

        }
    }
}



   

