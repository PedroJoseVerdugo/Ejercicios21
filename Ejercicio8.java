package ejerciciospoo;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temp = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("ingresa temperatura media mes" + (i + 1) + ":");
            temp[i] = sc.nextInt();
        }
        System.out.println("Diagrama barra temperaturas medias:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Mes" + (i + 1) + ":");
            for (int j = 0; j < temp[1]; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }

}
