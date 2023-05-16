package ejerciciospoo;

public class Ejercicio_21 {

    public static void main(String[] args) {
        int[] array = generarArrayAleatorio(15, 0, 500);

        System.out.println("Array original:");
        mostrarArray(array);

        cincuerizarArray(array);

        System.out.println("Array cincuerizado:");
        mostrarArray(array);
    }

    public static int[] generarArrayAleatorio(int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

    public static void cincuerizarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) {
                array[i] = ((array[i] / 5) + 1) * 5;
            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
