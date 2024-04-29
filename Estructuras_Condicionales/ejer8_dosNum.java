//Leer 2 números; si son iguales que los multiplique, si el primero es mayor que el segundo
//que los reste y si no que los sume.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer8_dosNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println("Multiplicación: " + num1 * num2);
        }
        else{
            if (num1 > num2){
                System.out.println("Resta: " + (num1 - num2));
            }
            else{
                System.out.println("Suma: " + (num1 + num2));
            }
        }

        input.close();
    }
}
