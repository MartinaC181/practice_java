//Leer dos números y encontrar:
//a. La suma del doble del primero más el cuadrado del segundo.
//b. El promedio de sus cubos.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class dos_numeros {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        double num1 = ing.nextDouble();
        System.out.println("Ingresar el segundo numero");
        double num2 = ing.nextDouble();
        double suma = 2 * num1 + num2 * num2;

        System.out.println("La suma del doble del primero más el cuadrado del segundo es " + suma);

        double promedioCubos = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
        System.out.println("El promedio de los cubos de ambos numeros es: " + promedioCubos);

        ing.close();
    }
}
