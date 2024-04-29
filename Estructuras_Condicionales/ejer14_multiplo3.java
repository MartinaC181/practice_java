//Se desea leer un número de dos cifras, y que se muestre por pantalla sus dígitos. Luego
//informe si la suma de sus dígitos es múltiplo de 3 o no.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer14_multiplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número de dos cifras");
        int num = input.nextInt();
        int dig1 = 0;
        int dig2 = 0;

        if (num >= 10){
            dig1 = num / 10;
            dig2 = num % 10;
            System.out.println("El primer dígito es: " + dig1);
            System.out.println("El segundo dígito es: " + dig2);
            if ((dig1 + dig2) % 3 == 0){
                System.out.println("La suma de ambos dígitos es divisible por 3");
            }
        }
        else{
            System.out.println("El número ingresado no es válido");
        }

        input.close();
    }
}
