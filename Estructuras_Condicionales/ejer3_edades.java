//Solicitar la edad de dos hermanos, mostrando un mensaje que informe la edad del mayor
//y cuántos años de diferencia tiene con el menor.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer3_edades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad de dos hermanos");
        int herm1 = input.nextInt();
        int herm2 = input.nextInt();
        int difEdad = 0;
        if (herm1 > herm2){
            difEdad = herm1 - herm2;
        }
        else {
            difEdad = herm2 - herm1;
        }

        if (herm1 > herm2){
            System.out.println("La edad del hermano mayor es: " + herm1 + " y hay " + difEdad + " años de diferencia con el hermano menor");
        }
        else {
            System.out.println("La edad del hermano mayor es: " + herm2 + " y hay " + difEdad + " años de diferencia con el hermano menor");
        }

        input.close();
    }
}
