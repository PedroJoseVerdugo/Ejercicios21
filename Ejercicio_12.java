package ejerciciospoo;
import java.util.Scanner;

public class Ejercicio_12 {
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Array inicial:");
        System.out.println("Índice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
        
        System.out.print("Introduce la posición inicial (0-9): ");
        int inicial = scanner.nextInt();
        System.out.print("Introduce la posición final (0-9): ");
        int fina = scanner.nextInt();
        
        if (inicial < 0 || inicial > 9 || fina < 0 || fina > 9 || inicial >= fina) {
            System.out.println("Las posiciones no son válidas.");
            return;
        }
        
        int[] resultado = new int[10];
        
        for (int i = 0; i < 10; i++) {
            if (i == fina) {
                resultado[i] = numeros[inicial];
            } else if (i > fina && i <= inicial) {
                resultado[i] = numeros[i - 1];
            } else if (i < fina || i > inicial) {
                resultado[i] = numeros[i];
            }
        }
        
        System.out.println("Array final:");
        System.out.println("Índice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + resultado[i]);
        }
    }
}

