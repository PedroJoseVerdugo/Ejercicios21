package ejerciciospoo;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] num = new int[20];
        Random rand = new Random();

// 20 aleatorios para el array
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(101); // 0-100 = 101
        }
        int[] par = new int[num.length]; //Array aux par
        int[] impar = new int[num.length]; //Array aux impar
        int numPar = 0; //contador par
        int numImpar = 0; //contador impar
//Separamos num arrays aux par e impar
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par[numPar] = num[i];
                numPar++;
            } else {
                impar[numImpar] = num[i];
                numImpar++;
            }
        }
//conexion arrays par e impar en array
        for (int i = 0; i < numPar; i++) {
            num[numPar + i] = impar[i];
        }
        for (int i = 0; i < numImpar; i++) {
            num[numImpar + 1] = impar[i];
        }
//Mostrar final array con pares e impares
        System.out.println(Arrays.toString(num));

    }

}
