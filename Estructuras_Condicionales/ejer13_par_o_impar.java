//Elabore una solución que solicite el ingreso de un número entero distinto de 0 y se
//informe si es par o no
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer13_par_o_impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número distinto de cero");
        int num = input.nextInt();
        int resto = num % 2;

        if (num != 0){
           if (resto == 0){
            System.out.println("El número es PAR");
           }
           else{
            System.out.println("El número es IMPAR");
           }
        }
        else{
            System.out.println("El número ingresado es 0");
        }

        input.close();
    } 
}
