//Una compañía de seguros está abriendo un depto. de finanzas y estableció un programa
//para captar clientes, que consiste en lo siguiente: Si el monto por el que se efectúa la
//fianza es menor que $50.000 la cuota a pagar será por el 3% del monto, y si el monto es
//mayor que $50.000 la cuota a pagar será el 2% del monto. La compañía desea determinar
//cuál será la cuota que debe pagar un cliente.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer10_seguros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto de la finanza");
        int finanza = input.nextInt();
        
        if (finanza < 50000){
            System.out.println("La cuota a pagar es: " + (finanza / 100) * 3);
        }
        else{
            System.out.println("La cuota a pagar es: " + (finanza / 100) * 2);
        }

        input.close();
    }
}
