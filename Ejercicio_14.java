package ejerciciospoo;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        String[] palabras = new String[8];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce una palabra: ");
            palabras[i] = scanner.nextLine();
        }

        System.out.println("Array original:");
        mostrarArray(palabras);

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] arrayColores = new String[8];
        String[] arrayNoColores = new String[8];

        int indiceColores = 0;
        int indiceNoColores = 0;

        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equalsIgnoreCase(colores[j])) {
                    arrayColores[indiceColores] = palabras[i];
                    indiceColores++;
                    esColor = true;
                    break;
                }
            }
            if (!esColor) {
                arrayNoColores[indiceNoColores] = palabras[i];
                indiceNoColores++;
            }
        }

        String[] arrayResultado = new String[8];
        System.arraycopy(arrayColores, 0, arrayResultado, 0, indiceColores);
        System.arraycopy(arrayNoColores, 0, arrayResultado, indiceColores, indiceNoColores);

        System.out.println("Array resultado:");
        mostrarArray(arrayResultado);
    }

    public static void mostrarArray(String[] array) {

        System.out.print("│ 0\t│ 1\t│ 2\t│ 3\t│ 4\t│ 5\t│ 6\t│ 7\t│\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print("│ " + array[i] + "\t");
        }

    }
}
