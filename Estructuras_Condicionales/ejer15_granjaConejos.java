//En una Granja existen N conejos, N1 blancos y N2 negros. Suponiendo que P1 es el precio
//de venta de los conejos blancos y P2 es el precio de venta de los conejos negros, imprima
//el monto total de la venta. Informe al final el color de los conejos que más se vendieron.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer15_granjaConejos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de conejos blancos en la granja");
        int conejosB = input.nextInt();
        System.out.println("Ingrese el precio de cada conejo blanco");
        int precioB = input.nextInt();
        System.out.println("Ingrese la cantidad de conejos negros en la granja");
        int conejosN = input.nextInt();
        System.out.println("Ingrese el precio de cada conejo negro");
        int precioN = input.nextInt();

        System.out.println("El monto total de la venta es: " + ((precioB*conejosB) + (precioN*conejosN)));
        if (conejosB > conejosN){
            System.out.println("Se vendieron más conejos blancos");
        }
        else{
            System.out.println("Se vendieron más conejos negros");
        }
        
        input.close();
    }
    
}
