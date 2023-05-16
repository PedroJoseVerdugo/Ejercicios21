package ejerciciospoo;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        int[] mesas = new int[10]; // Array para almacenar la ocupación de las mesas (0 a 4 personas)

        Scanner scanner = new Scanner(System.in);
        int numPersonas;

        // Generar ocupación inicial de las mesas de forma aleatoria
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5); // número aleatorio de 0 a 4
        }

        // Mostrar estado inicial de las mesas
        mostrarMesas(mesas);

        // Pedir número de personas hasta q -1 para salir
        do {
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            numPersonas = scanner.nextInt();

            if (numPersonas > 0) {
                if (numPersonas <= 4) {
                    int mesaAsignada = buscarMesa(numPersonas, mesas);
                    if (mesaAsignada != -1) {
                        System.out.println("Por favor, siéntense en la mesa número " + (mesaAsignada + 1) + ".");
                        mesas[mesaAsignada] += numPersonas;
                    } else {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                } else {
                    System.out.println("Lo siento, no admitimos grupos de " + numPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo.");
                }

                // Mostrar estado actual de las mesas
                mostrarMesas(mesas);
            }
        } while (numPersonas != -1);

        System.out.println("Gracias. Hasta pronto.");
    }

    public static int buscarMesa(int numPersonas, int[] mesas) {
        // Busca mesa libre para numPersonas
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0 || mesas[i] + numPersonas <= 4) {
                return i; // Mesa encontrada
            }
        }
        return -1; //  mesa no dispnible
    }

    public static void mostrarMesas(int[] mesas) {

        System.out.print("│Mesa nº \t│ 1\t│ 2\t│ 3\t│ 4\t│ 5\t│ 6\t│ 7\t│ 8\t│ 9\t│ 10\t│\n");

        System.out.print("│Ocupación\t");
        for (int i = 0; i < mesas.length; i++) {
            System.out.print("│ " + mesas[i] + "\t");
        }
        System.out.print("│\n");
        System.out.println("Adios");
    }
}
