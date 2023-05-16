
package ejerciciospoo;

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        //Leer numeros y almacenar en array
        for(int i =0; i<num.length; i++){
            System.out.print("Ingresa el numero" + (i + 1) + "; ");
            num[i] = sc.nextInt();
        }
        //Guardar ultimo
        int ultimo = num[num.length - 1];
        //Recorrer desde la penultimahatsa primera +1posicion derecha
        for (int i = num.length -2; i>=0; i--){
            num[i + 1] = num[i];
        }
        //Coloca variable ultimoen 0
        num[0] = ultimo;
        //Mostrar array Resultado
        System.out.println("Array resultado:");
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    
}
