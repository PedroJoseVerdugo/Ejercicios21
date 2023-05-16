package ejerciciospoo;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        int[] numeros = new int[20];

        // Rellenar el array con números aleatorios entre 0 y 400
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(401);
        }

        // Mostrar el array original
        mostrarArray(numeros);

        // Preguntar al usuario qué números quiere resaltar
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int opcion = scanner.nextInt();

        // Mostrar el array números resaltados
        mostrarArrayResaltado(numeros, opcion);
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mostrarArrayResaltado(int[] array, int opcion) {
        for (int i = 0; i < array.length; i++) {
            if ((opcion == 1 && array[i] % 5 == 0) || (opcion == 2 && array[i] % 7 == 0)) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
