//Dado un numero entre 1 y 7 escriba su correspondiente día de la semana así:
//1- Lunes 2- Martes 3- Miércoles 4- Jueves 5- Viernes 6- Sábado 7- Domingo
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer12_semana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        int num = input.nextInt();

        if (num <= 7){
            if (num == 1){
                System.out.println("Lunes");
            }
            else{
                if (num == 2){
                    System.out.println("Martes");
                }
                else{
                    if (num == 3){
                        System.out.println("Miércoles");
                    }
                    else{
                        if (num == 4){
                            System.out.println("Jueves");
                        }
                        else{
                            if (num == 5){
                                System.out.println("Viernes");
                            }
                            else{
                                if (num == 6){
                                    System.out.println("Sábado");
                                }
                                else{
                                    System.out.println("Domingo");
                                }
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
