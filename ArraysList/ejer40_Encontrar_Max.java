/**Desarrolla una función que encuentre el elemento máximo en un array de números.
 Por ejemplo, para el array [10, 3, 4, 15, 7], la función debe retornar 15.**/

package practice.Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ejer40_Encontrar_Max {

    public static int encontrar_max (ArrayList<Integer> array) {
        int max = 0;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
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

        System.out.println("El elemento máximo es: " + encontrar_max(array1));
    }
}
