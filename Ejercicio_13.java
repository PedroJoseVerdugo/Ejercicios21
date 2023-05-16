package ejerciciospoo;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_13 {
    
    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(501);
        }
        
        System.out.println("Array:");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int opcion = scanner.nextInt();
        
        int destacado = 0;
        if (opcion == 1) {
            int minimo = numeros[0];
            for (int i = 1; i < 100; i++) {
                if (numeros[i] < minimo) {
                    minimo = numeros[i];
                }
            }
            destacado = minimo;
        } else if (opcion == 2) {
            int maximo = numeros[0];
            for (int i = 1; i < 100; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
            }
            destacado = maximo;
        } else {
            System.out.println("Opción inválida.");
            return;
        }
        
        System.out.println("Array con número destacado:");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == destacado) {
                System.out.print("**" + numeros[i] + "** ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
}

