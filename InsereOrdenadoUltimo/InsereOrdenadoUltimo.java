package InsereOrdenadoUltimo;

import java.util.Arrays;
import java.util.Scanner;

public class InsereOrdenadoUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] inteiros = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            inteiros[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Arrays.toString(insereOrdenadoUltimo(inteiros)));
    }

    public static int[] insereOrdenadoUltimo(int[] inteiros){
        for(int i = inteiros.length -1; i > 0; i--) {
            if (inteiros[i] < inteiros[i-1]) {
                int aux = inteiros[i];
                inteiros[i] = inteiros[i - 1];
                inteiros[i - 1] = aux;
            }
        }
        return inteiros;
    }

}
