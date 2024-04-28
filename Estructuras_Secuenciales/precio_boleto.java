// Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros que
//  se van a recorrer, siendo el precio $45 por Km.
package Estructuras_Secuenciales;

import java.util.Scanner;


public class precio_boleto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del viaje por kilometro");
        double precioKM = input.nextDouble();
        System.out.println("Ingresar kilometros");
        int distancia = input.nextInt();
        double precio = distancia * precioKM ;
        System.out.println("El precio del boleto es " + precio);

        input.close();
    }
}
