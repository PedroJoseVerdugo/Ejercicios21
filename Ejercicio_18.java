package ejerciciospoo;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_18 {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(10, 0, 200);

        System.out.println("Array original:");
        mostrarArrayConIndice(numeros);

        ordenarArray(numeros);

        System.out.println("Array resultado:");
        mostrarArrayConIndice(numeros);
    }

    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        int[] numeros = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }
        return numeros;
    }

    public static void mostrarArrayConIndice(int[] array) {
        System.out.print("│ Índice ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("│ %2d ", i);
        }

        System.out.print("│ Valor  ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("│ %3d ", array[i]);
        }

    }

    public static void ordenarArray(int[] array) {
        int[] menores = new int[array.length];
        int[] mayores = new int[array.length];
        int indiceMenores = 0;
        int indiceMayores = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 100) {
                menores[indiceMenores] = array[i];
                indiceMenores++;
            } else {
                mayores[indiceMayores] = array[i];
                indiceMayores++;
            }
        }

        Arrays.sort(menores, 0, indiceMenores);
        Arrays.sort(mayores, 0, indiceMayores);

        int indiceResultado = 0;
        int indiceMenor = 0;
        int indiceMayor = 0;

        while (indiceMenor < indiceMenores && indiceMayor < indiceMayores) {
            array[indiceResultado] = menores[indiceMenor];
            indiceResultado++;
            indiceMenor++;

            array[indiceResultado] = mayores[indiceMayor];
            indiceResultado++;
            indiceMayor++;
        }

        while (indiceMenor < indiceMenores) {
            array[indiceResultado] = menores[indiceMenor];
            indiceResultado++;
            indiceMenor++;
        }

        while (indiceMayor < indiceMayores) {
            array[indiceResultado] = mayores[indiceMayor];
            indiceResultado++;
            indiceMayor++;
        }
    }
}
