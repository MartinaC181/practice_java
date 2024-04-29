//Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas
//extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de
//40, el resto se consideran horas extras y que estas se pagan al doble de una hora normal
//cuando no exceden de 8; si las horas extras exceden de 8 se pagan las primeras 8 al doble
//de lo que se pagan las horas normales y el resto al triple.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer9_sueldoHorasExtras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int horas = input.nextInt();
        double extraDoble = 0;
        double extraTriple = 0;

        if (horas > 40){
            if ((horas - 40) <= 8){
                extraDoble = ((100 / 40) * 8) * 2;
                System.out.println(extraDoble);
                System.out.println("El trabajador recibirá el " + extraDoble + " % adiccional a su sueldo por las horas extras");
            }
            else{
                extraTriple = ((100 / 40) * (horas - 48)) * 3;
                System.out.println("El trabajador recibirá el " + (extraTriple + extraDoble) + " % adiccional a su sueldo por las horas extras");
            }
        }
        else{
            System.out.println("El trabajador no hizo horas extras");
        }

        //input.close();
    }
}
