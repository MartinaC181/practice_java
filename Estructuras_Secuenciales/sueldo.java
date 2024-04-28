//Escriba un algoritmo que dado el número de horas trabajadas por un empleado y el sueldo
//por hora, calcule el sueldo total de ese empleado. Tenga en cuenta que las horas extras se
//pagan el doble.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class sueldo {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de horas trabajadas"); 
      int horas = input.nextInt(); 
      System.out.println("Ingrese las horas");
      int horasExtras = input.nextInt();
      System.out.println("Ingrese el sueldo por hora");
      double sueldoHora = input.nextDouble();
      double sueldoTotal = 2 * (sueldoHora * horasExtras) + sueldoHora * horas;

      System.out.println("El sueldo total es " + sueldoTotal);

      input.close();
    }
}
