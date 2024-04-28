
package hello_wold;

import java.util.Scanner;

public class clase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();
        int suma = num1 + num2;
        double div = num1 / num2;
        System.out.println("La suma de " + num1 + " mas " + num2 + " es " + suma);
        System.out.println("La division de " + num1 + " entre " + num2 + " es: " + div);

        //** String verResultado = (div > 0)? "Es positivo":"Es negativo";
        //** System.out.println(verResultado);
        }

      

