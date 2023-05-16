
package ejerciciospoo;

import java.util.Scanner;


public class Ejercicio9 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        // 8 numeros enteros
        for(int i=0; i<num.length; i++){
             System.out.print("Ingrese numeros enteros " + (i+1) + ": ");
             num[1] = sc.nextInt();
        }
        //Recorrer - Mostrar: Par - Impar
        System.out.println("Los numeros son:");
        for(int i=0; i<num.length; i++){
            if(num[i] % 2 ==0) {
                System.out.println(num[i] + " Par");
            } else {
                System.out.println(num[i] + " Impar");
            }
        }
    }
    
}
