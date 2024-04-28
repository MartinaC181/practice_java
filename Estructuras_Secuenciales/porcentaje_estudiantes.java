//Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en
//un grupo de estudiantes.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class porcentaje_estudiantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes hombres");
        int hombres = input.nextInt();
        System.out.println("Ingrese la cantidad de estudiantes mujeres");
        int mujeres = input.nextInt();
        
        System.out.println("El porcentaje de estudiantes hombres es: " + hombres * 100 / (hombres + mujeres));
        System.out.println("El porcentaje de estudiantes mujeres es: " + mujeres * 100 / (mujeres + hombres));

        input.close();
    }
}
