/**Diseña una función que tome un array de números y devuelva un nuevo array donde cada elemento
 es la suma de los elementos hasta esa posición en el array original. Por ejemplo,
 para el array [1, 2, 3, 4], el resultado sería [1, 3, 6, 10].**/

package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer43_Suma_subArrays {
    public static ArrayList<Integer> suma_arrays (ArrayList<Integer> array){
        ArrayList<Integer> new_array = new ArrayList<>();
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
            new_array.add(suma);
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
        System.out.println("La suma de cada elemento más el anterios son: " + suma_arrays(array1));
    }
}
