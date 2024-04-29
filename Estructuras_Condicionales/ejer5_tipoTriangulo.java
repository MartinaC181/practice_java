//Dados los lados de un triángulo, informar qué tipo es: isósceles, escaleno o equilátero.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer5_tipoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese los 3 lados de un triangulo");
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Es un triángulo Equilátero");
        }
        else {
            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Es un triángulo Isóceles");
            }
            else{
                System.out.println("Es un triángulo Escaleno");
            }
        }
        input.close();
    }   
}
