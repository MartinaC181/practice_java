//En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000.
//Mostrar por pantalla cuál será la cantidad que pagará una persona por su compra.
package Estructuras_Condicionales;

import java.util.Scanner;

public class ejer2_almacen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto de su compra");
        int compra = input.nextInt();

        if (compra > 1000){
            System.out.println("Gracias al 20% de descuento usted pagará: " + (compra - (compra/100) *20));
        }
        else {
            System.out.println("Su compra no supera el monto esperado para aplicar el descuento. Usted pagará: " + compra);
        }
        input.close();
    }
    
}
