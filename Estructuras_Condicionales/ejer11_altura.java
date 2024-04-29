//Se desea escribir un algoritmo que pida la altura de una persona, si la altura es menor o
//igual a 150 cm envíe el mensaje: “Persona de altura baja”; si la altura está entre 151 y 170
//escriba el mensaje: “Persona de altura media” y si la altura es mayor al 171 escriba el
//mensaje: “Persona alta”.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer11_altura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su altura en cm");
        int alt = input.nextInt();

        if (alt <= 150){
            System.out.println("Persona de altura baja");
        }
        else{
            if (alt > 150 && alt <= 170){
                System.out.println("Persona de altura media");
            }
            else{
                System.out.println("Persona alta");
            }
        }
        
        input.close();
    }
    
}
