package ejerciciospoo;



import java.util.Scanner;

public class Ejercicio_11 {
    
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

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
        
        int indicePrimos = 0;
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                int temp = numeros[indicePrimos];
                numeros[indicePrimos] = numeros[i];
                numeros[i] = temp;
                indicePrimos++;
            }
        }
        
        System.out.println("Array final:");
        System.out.println("Índice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
    }
}
