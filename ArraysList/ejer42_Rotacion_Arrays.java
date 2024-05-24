/**Escribe un programa que rote los elementos de un array hacia la derecha n veces.
 Por ejemplo, si el array es [1, 2, 3, 4, 5] y n = 2, el resultado debe ser [4, 5, 1, 2, 3].**/

package practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejer42_Rotacion_Arrays {

    public static ArrayList<Integer> rotar_element (ArrayList<Integer> array, int n) {
        Collections.rotate(array, n);
        return array;
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

        System.out.println("Ingrese la cantidad de veces que quiere rotar los elementos");
        int n = input.nextInt();

        System.out.println("Los numeros ingresados son: " + array1);
        System.out.println("Los elementos rotaron hacia la derecha " + n + " veces: " + rotar_element(array1, n));
    }
}
