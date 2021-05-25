package SelectionRecursivo;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int[] inteiros = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            inteiros[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(sort(inteiros, 0, inteiros.length - 1)));
    }

    private static int[] sort(int[] array, int leftIndex, int rightIndex) {
        if (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
                && array.length > 1) {
            int menor_index = leftIndex;

            if (leftIndex < rightIndex) {
                for (int i = leftIndex; i < rightIndex + 1; i++) {
                    if (array[i]< array[menor_index]) {
                        menor_index = i;
                    }
                }

                int aux = array[menor_index];
                array[menor_index] = array[leftIndex];
                array[leftIndex] = aux;

                if (leftIndex + 1 < rightIndex) {
                    System.out.println(Arrays.toString(array));
                }

                return sort(array, leftIndex + 1, rightIndex);
            } else {
                return array;
            }
        } else {
            return array;
        }
    }
}
