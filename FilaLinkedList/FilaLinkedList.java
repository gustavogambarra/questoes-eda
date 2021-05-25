package FilaLinkedList;

import java.util.Scanner;

class FilaLinkedList {
    private static int contador = -1;
    private static int[] array = new int[100];
    private static final String FULL = "full";
    private static final String EMPTY = "empty";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        while(!input[0].equals("end")) {
            if (input[0].equals("add")) {
                if(isFull()) {
                    System.out.println(FULL);
                } else {
                    add(Integer.valueOf(input[1]));
                }
            } else if (input[0].equals("remove")) {
                if(isEmpty()) {
                    System.out.println(EMPTY);
                } else {
                    remove();
                }
            } else if (input[0].equals("print")) {
                if (isEmpty()) {
                    System.out.println(EMPTY);
                } else {
                    System.out.println(print());
                }
            } else if (input[0].equals("element")) {
                if (isEmpty()) {
                    System.out.println(EMPTY);
                } else {
                    System.out.println(element());
                }
            } else if (input[0].equals("search")) {
                System.out.println(search(Integer.valueOf(input[1])));
            }
            input = sc.nextLine().split(" ");
        }
        sc.close();
    }

    private static String print() {
        String output = "";
        for (int i = 0; i <= contador; i++) {
            output += array[i];
            if(i != contador) {
                output += " ";
            }
        }
        return output;
    }

    private static void add(int number) {
        contador++;
        array[contador] = number;
    }

    private static boolean isEmpty() {
        return contador == -1;
    }

    private static boolean isFull(){
        return contador == array.length - 1;
    }

    private static void remove() {
        swapBack();
        contador--;
    }

    private static int element() {
        return array[0];
    }

    private static int search(int n) {
        for (int i = 0; i <= contador; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    private static void swapBack() {
        for (int i = 0; i < contador; i++) {
            swap(i, i + 1);
        }
    }

    private static void swap(int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

}
