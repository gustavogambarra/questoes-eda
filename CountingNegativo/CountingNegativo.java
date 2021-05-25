package CountingNegativo;

import java.util.Arrays;
import java.util.Scanner;

public class CountingNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] v = input.split(" ");
        int[] arrayInt = parseIntArray(v);
        int maior = sc.nextInt();
        int menor = sc.nextInt();
        sort(arrayInt, menor, maior);
        System.out.println(Arrays.toString(arrayInt));
    }

    private static void sort(int[] array, int menor, int maior) {
        int[] counters = new int[maior - menor + 1];

        for (int i = 0; i < counters.length; i++)
            counters[i] = 0;
        for (int i = 0; i < array.length; i++) {
            counters[array[i] - menor]++;
            System.out.println(Arrays.toString(counters));
        }
        for (int i = 1; i < counters.length; i++)
            counters[i] += counters[i - 1];
        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(counters));

        int[] sorted = new int[array.length];
        for (int i = 0; i < sorted.length; i++)
            sorted[i] = array[i];

        for (int i = 0; i < array.length; i++) {
            int e = sorted[i];
            int j = --counters[e - menor];
            array[j] = e;
        }

        System.out.println(Arrays.toString(counters));
    }

    private static int[] parseIntArray(String[] v) {
        int[] vInteiros = new int[v.length];
        for (int i = 0; i < v.length; i++)
            vInteiros[i] = Integer.parseInt(v[i]);
        return vInteiros;
    }

}
