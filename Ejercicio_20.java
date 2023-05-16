package ejerciciospoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número total de nombres de reyes: ");
        int cantidadReyes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Map<String, Integer> reyes = new HashMap<>();

        System.out.println("Ingrese los nombres de los reyes y pulse INTRO:");
        for (int i = 0; i < cantidadReyes; i++) {
            String nombreRey = scanner.nextLine();
            reyes.put(nombreRey, reyes.getOrDefault(nombreRey, 0) + 1);
            System.out.println();
        }

        System.out.println("Los reyes intgresados son:");
        for (Map.Entry<String, Integer> entry : reyes.entrySet()) {
            String nombreRey = entry.getKey();
            int ordinal = entry.getValue();
            System.out.printf("%s %dº%n", nombreRey, ordinal);
        }
    }
}
