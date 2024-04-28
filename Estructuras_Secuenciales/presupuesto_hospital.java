//En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. El presupuesto anual
// del hospital se reparte de la siguiente manera: Urgencias 37%, Pediatría 42%, Traumatología 21%
//Obtener la cantidad de dinero que recibirá cada área para cualquier monto presupuestal.
package Estructuras_Secuenciales;

import java.util.Scanner;

public class presupuesto_hospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el presupuesto total");
        double presupuesto = input.nextDouble();
        double urgencias = 0.37;
        double pediatria = 0.42;
        double traumatologia = 0.21;

        System.out.println("El presupuesto para el area de Urgencias es de " + presupuesto * urgencias);
        System.out.println("El presupuesto para el area de Pediatria es de " + presupuesto * pediatria);
        System.out.println("El presupuesto para el area de Traumatologia es de  " + presupuesto * traumatologia);

        input.close();
    }
}
