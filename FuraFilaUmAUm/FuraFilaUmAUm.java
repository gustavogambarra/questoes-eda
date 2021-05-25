package FuraFilaUmAUm;

import java.util.Arrays;
import java.util.Scanner;

public class FuraFilaUmAUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = getArrayInteiros(sc);
        int i = Integer.parseInt(sc.nextLine());
        furaFila(array, i);
        sc.close();
    }

    private static void furaFila(int[] array, int indexPrimeiroIdoso) {

        int index = 0;
        for (int i = indexPrimeiroIdoso; i < array.length; i++) {
            int pivot = array[i];

            for (int k = i; k > index; k--) {
                array[k] = array[k - 1];
            }
            array[index] = pivot;
            index++;

            System.out.println(Arrays.toString(array));
        }

    }

    private static int[] getArrayInteiros(Scanner scan) {
        String[] input = scan.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }
}
