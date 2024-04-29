//Determinar si un alumno aprueba o desaprueba un curso, sabiendo que aprueba si su
//promedio de tres calificaciones es mayor o igual a 60; desaprueba en caso contrario.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer1_aprobar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las 3 calificaciones del alumno");
        int nota1 = input.nextInt();
        int nota2 = input.nextInt();
        int nota3 = input.nextInt();
        int promedio = (nota1+ nota2 + nota3) / 3;
        
        if (promedio >= 60){
            System.out.println("El premedio es: " + promedio);
            System.out.println("Aprobó la materia");
        }
        else {
            System.out.println("El premedio es: " + promedio);
            System.out.println("Desaprobó la materia");
        }
        input.close();
    }
}