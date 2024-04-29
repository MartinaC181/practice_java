//Se desea conocer el promedio y porcentaje de hombres y mujeres cursando
//Programación I en UTN FRRe, teniendo como dato la cantidad de hombres y mujeres de 3
//comisiones.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class porcentaje_tup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hombres en la comision 1");
        int hombres1 = input.nextInt();
        System.out.println("Ingrese la cantidad de hombres en la comision 2");
        int hombres2 = input.nextInt();
        System.out.println("Ingrese la cantidad de hombres en la comision 3");
        int hombres3 = input.nextInt();
        int totalHombres = hombres1+hombres2+hombres3;
        System.out.println("Ingrese la cantidad de mujeres en la comision 1");
        int mujeres1 = input.nextInt();
        System.out.println("Ingrese la cantidad de mujeres en la comision 2");
        int mujeres2 = input.nextInt();
        System.out.println("Ingrese la cantidad de mujeres en la comision 3");
        int mujeres3 = input.nextInt();
        int totalMujeres = mujeres1+mujeres2+mujeres3;

        int promedio = (totalHombres + totalMujeres) / 3;
        int porcentajeMujeres = totalMujeres * 100 / (totalMujeres+totalHombres);
        int porcentajeHombres = totalHombres * 100 / (totalHombres+totalMujeres);

        System.out.println("EL PROMEDIO DE ALUMNOS ES DE: " + promedio);
        System.out.println("El porcentaje de mujeres es de: " + porcentajeMujeres + "%");
        System.out.println("El porcentaje de hombres es de: " + porcentajeHombres + "%");

        input.close();
    }
}
