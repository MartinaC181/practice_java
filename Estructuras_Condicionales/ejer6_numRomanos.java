//Elaborar una solución que permita ingresar un número entero del 1 al 10 y muestre su equivalente
// en números romanos.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer6_numRomanos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entero del 1 al 10 para ver su equivalente en número romano");
        int num = input.nextInt();

        if (num <= 10){
            if (num <= 5){
                if (num == 1){
                    System.out.println("I");
                }
                else{
                    if (num == 2){
                        System.out.println("II");
                    }
                    else{
                        if (num == 3){
                            System.out.println("III");
                        }
                        else{
                            if (num == 4){
                                System.out.println("IV");
                            }
                            else{
                                System.out.println("V");
                            }
                        }
                    }
                }
            }
            else {
                if (num == 6){
                    System.out.println("VI");
                }
                else{
                    if (num == 7){
                        System.out.println("VII");
                    }
                    else{
                        if (num == 8){
                            System.out.println("VIII");
                        }
                        else{
                            if (num == 9){
                                System.out.println("IX");
                            }
                            else{
                                System.out.println("X");
                            }
                        }
                    }
                }   
            }
        } 
        else{
                System.out.println("El número ingresado no es válido");
        }

        input.close();
    }
    
}
