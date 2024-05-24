/**Implementa una función que elimine todos los elementos inferiores a 0.**/

package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer41_Filtrado_Arrays {

    public static ArrayList<Integer> filtrar_element (ArrayList<Integer> array) {
        ArrayList<Integer> array_positivo = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) >= 0) {
                array_positivo.add(array.get(i));
            }
        }
        return array_positivo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array1 = new ArrayList<>();
        System.out.println("Ingrese cinco números positvos o negativos");
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());
        array1.add(input.nextInt());

        System.out.println("Los números positivos son: " + filtrar_element(array1));
    }
}
