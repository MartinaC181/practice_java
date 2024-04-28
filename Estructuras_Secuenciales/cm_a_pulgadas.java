//Elabore un programa que realice la conversión de cm. a pulgadas.
//a) Donde 1cm = 0.39737 pulgadas.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class cm_a_pulgadas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese los centimetros a convertir");
    int cm = input.nextInt();
    double pulgadas = cm * 0.39737;
    
    System.out.println(cm + " cm son " + pulgadas + " pulgadas");

    input.close();
    }
}
