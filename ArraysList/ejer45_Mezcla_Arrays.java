/**Escribe una función que combine dos arrays de entrada intercalando sus elementos.
 Por ejemplo, dados los arrays [a, b, c] y [1, 2, 3], el resultado debería ser [a, 1, b, 2, c, 3].**/


package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer45_Mezcla_Arrays {

    public static ArrayList<Integer> mezclar_arrays(ArrayList<Integer> array1, ArrayList<Integer> array2){
        ArrayList<Integer> array_mezclado = new ArrayList<>();
        int lenth = array1.size() + array2.size();
        for (int i = 0; i < array1.size(); i++) {
            array_mezclado.add(array1.get(i));
            array_mezclado.add(array2.get(i));
        }
        return array_mezclado;
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

        System.out.println("Este es el primer arreglo: " + array1);
        System.out.println("Este es el segundo arreglo: " + array2);

        System.out.println("La mezcla intercalada de ambos arreglos es: " + mezclar_arrays(array1, array2));
    }
}
