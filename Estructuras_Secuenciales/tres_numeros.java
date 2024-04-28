//Leer tres números enteros de un Digito y almacenarlos en una sola variable que contenga
//a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class tres_numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = input.nextInt();
        int tresDigitos = 100 * num1 + 10 * num2 + num3;
        System.out.println("Los tres numeros: " + tresDigitos);
        input.close();
    }
}
