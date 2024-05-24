/**Crea una función que tome un número entero n y retorne un array que contenga pares de
números cuya suma sea igual a n. Cada par debe ser único y estar representado como un array.
 Por ejemplo, si n = 5, algunos pares posibles incluyen [ 2, 3, 4, 1,.... 0, 5 ].**/


package practice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer46_Array_Pares {
     public static ArrayList<int[]> array_pares(int n){
         ArrayList<int[]> array_de_pares = new ArrayList<>();

         for ( int i = 0; i <= n/2; i++){
             int complemento = n - i;
             if (complemento >= i){
                 array_de_pares.add(new int[] {i, complemento});
             }
         }
         return array_de_pares;
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int n = input.nextInt();

        System.out.println("Pares cuya suma es igual a " + n + ":");
        ArrayList<int[]> pares = array_pares(n);

        for (int[] par : pares) {
            System.out.println("[" + par[0] + ", " + par[1] + "]");
        }
    }
}
