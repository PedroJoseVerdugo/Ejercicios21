
package ejerciciospoo;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio7 {

   
    public static void main(String[] args) {
     
        //Gnumeros aleatorios
        Random rand = new Random();
        int[] num = new int[100];
        for (int i = 0; i <num.length; i++){
            num[1] = rand.nextInt(21);//entre0-20
            System.out.print(num[i] + " ");
            
        }
        System.out.println(); 
        
        //Valores a cambiar
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de cambio:");
        int v1 = sc.nextInt();
        System.out.print("Ingresa el nuevo valor");
        int v2 = sc.nextInt();
        
        //cambiar valore
        for (int i = 0; i<num.length; i++){
            if(num[i] == v1){
                num[i] = v2;
                System.out.print("'" + v1 + "' ");
            } else {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println(); 
        
        
        
    }
    
}
