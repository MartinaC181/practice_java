/**Escribe un programa que invierta los elementos de un array dado. Por
ejemplo, si el array de entrada es [1, 2, 3, 4, 5], el programa debería
retornar [5, 4, 3, 2, 1]**/

package practice.Arrays;

import java.util.Scanner;

public class ejer38_Inversion_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];


        System.out.println("Ingrese cinco números");
        for (int i = 0; i < 5; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Ahora en orden inverso!");
        for (int i = 4; i  >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
