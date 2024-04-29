//Diseñar una solución que permita ingresar tres números enteros, e informe cuál es el
//mayor.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer4_numMayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los tres números enteros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        @SuppressWarnings("unused")
        int  mayor = 0;

        if (num1 > num2 && num1 > num3){
            mayor = num1;
            System.out.println("El mayor entre los tres es el número: " + num1);
        }
        else {
            if (num2 > num1 && num2 > num3){
                System.out.println("El mayor entre los tres es el número: " + num2);
            }
            else {
                System.out.println("El mayor entre los tres es el número: " + num3);
            }
        }
        input.close();
    }
}
