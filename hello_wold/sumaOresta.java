package hello_wold;

import java.util.Scanner;

public class sumaOresta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();
        int suma = 0;
        int resta = 0;

        System.out.println("Ingrese 1 para suma y 2 para resta");
        int elecion = input.nextInt();
        switch(elecion) {
            case 1:
                System.out.println("Suma");
                suma = num1 + num2;
                break;
            case 2:
                System.out.println("Resta");
                resta = num1 - num2;
                break;
        }
        if(elecion == 1) {
            if((suma % 2) == 0) {
                System.out.println("Es par");
            }else {
                System.out.println("Es impar");
            }
        }else {
            if(elecion == 2) {
                if((resta % 2) == 0) {
                System.out.println("Es par");
                } else{
                System.out.println("Es impar");
                }
            }
            input.close();
        }
    }
}
