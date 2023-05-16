package ejerciciospoo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(12, 0, 200);

        System.out.println("Array original:");
        mostrarArrayConIndice(numeros);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el número que quiere insertar: ");
        int numeroInsertar = scanner.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int posicion = scanner.nextInt();

        numeros = insertarNumero(numeros, numeroInsertar, posicion);

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
        System.out.print("Índice ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        System.out.print("Valor  ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
    }

    public static int[] insertarNumero(int[] array, int numero, int posicion) {
        if (posicion < 0 || posicion >= array.length) {
            System.out.println("Posición inválida. No se realizará la inserción.");
            return array;
        }

        int[] resultado = Arrays.copyOf(array, array.length);

        for (int i = resultado.length - 2; i >= posicion; i--) {
            resultado[i + 1] = resultado[i];
        }

        resultado[posicion] = numero;
        return resultado;
    }
}
