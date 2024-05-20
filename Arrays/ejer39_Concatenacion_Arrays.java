/**Crea una función que tome dos arrays como argumentos y retorne
un nuevo array que sea la concatenación de los dos arrays de entrada. Por ejemplo,
concatenar [1, 2, 3] y [4, 5, 6] debería dar como resultado [1, 2, 3, 4, 5, 6].**/

package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer39_Concatenacion_Arrays {

    public static ArrayList<Integer> concatenar_arrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> arrayNuevo = new ArrayList<>();

        arrayNuevo.addAll(array1);
        arrayNuevo.addAll(array2);
        return arrayNuevo;
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

        ArrayList<Integer> array2 = new ArrayList<>();
        System.out.println("Ingrese cinco números más");
        array2.add(input.nextInt());
        array2.add(input.nextInt());
        array2.add(input.nextInt());
        array2.add(input.nextInt());
        array2.add(input.nextInt());

        ArrayList<Integer> arrayNuevo = concatenar_arrays(array1, array2);

        System.out.println("Este es el primer arreglo: " + array1);
        System.out.println("Este es el segundo arreglo: " + array2);
        System.out.println("Y esta es la unión de ambos arreglos!");
        System.out.println(arrayNuevo);
    }
}
