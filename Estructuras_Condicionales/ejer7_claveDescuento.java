//Hacer un algoritmo que imprima el nombre de un artículo, clave, precio original y su
//precio con descuento. El descuento lo hace en base a la clave, si la clave es 01 el
//descuento es del 10% y si la clave es 02 el descuento en del 20% (solo existen dos claves).
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer7_claveDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la clave del artículo");
        int clave = input.nextInt();
        

        if (clave == 01){
            System.out.println("");
        }
    }
    
}
