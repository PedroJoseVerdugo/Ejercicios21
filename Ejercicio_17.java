package ejerciciospoo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(10, 0, 100);

        System.out.println("Array original: ");
        mostrarArray(numeros);

        int numeroUsuario = pedirNumeroUsuario(numeros);
        rotarArray(numeroUsuario, numeros);

        System.out.println("Array rotado: ");
        mostrarArray(numeros);
    }

    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        int[] numeros = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }
        return numeros;
    }

    public static void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int pedirNumeroUsuario(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean encontrado = false;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == numero) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El número no se encuentra en el array. Inténtalo de nuevo.");
            }

        } while (!encontrado);

        return numero;
    }

    public static void rotarArray(int numero, int[] array) {
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                posicion = i;
                break;
            }
        }

        while (posicion > 0) {
            int temp = array[posicion];
            array[posicion] = array[posicion - 1];
            array[posicion - 1] = temp;
            posicion--;
        }
    }
}
