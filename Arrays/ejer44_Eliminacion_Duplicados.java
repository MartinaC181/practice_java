/**Desarrolla un programa que elimine todos los elementos duplicados de un array.
 Utiliza un método que optimice la búsqueda de duplicados sin usar funciones predefinidas como Set.**/

package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer44_Eliminacion_Duplicados {

    public static ArrayList<Integer> eliminar_duplicado(ArrayList<Integer> array){
        ArrayList<Integer> new_array = new ArrayList<>();
        for (int element : array) {
            if (!new_array.contains(element)) {
                new_array.add(element);
            }
        }
        return new_array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array1 = new ArrayList<>();
        System.out.println("Ingrese cinco números");
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());

        System.out.println("Los números ingresados son: " + array1);
        System.out.println("Estos son los números sin duplicados: " + eliminar_duplicado(array1));
    }
}
