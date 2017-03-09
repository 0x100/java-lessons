package task1.v3.subtask2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static Random rnd = new Random();
    public static int indexes[];

    public static void main(String[] args) {
        int[] sequence = new int[3];
        int[] arr = initArray(10, 2);
        System.out.println(Arrays.toString(arr));
        if ((arr[indexes[0]] + arr[indexes[1]] > 9 || arr[indexes[0]] + arr[indexes[1]] < 4) || (indexes[0] % 3 == indexes[1] % 3)) {
            System.out.println("NONONO BROH");
        } else {
            for (int i = 0; i < indexes.length; i++) {
                switch (indexes[i] % 3) {
                    case 0:
                        sequence[0] = arr[indexes[i]];
                        break;
                    case 1:
                        sequence[1] = arr[indexes[i]];
                        break;
                    case 2:
                        sequence[2] = arr[indexes[i]];
                        break;
                }
            }

            if (sequence[0] == 0)
                sequence[0] = 10 - sequence[1] - sequence[2];
            else if (sequence[1] == 0)
                sequence[1] = 10 - sequence[0] - sequence[2];
            else sequence[2] = 10 - sequence[0] - sequence[1];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sequence[i%3];
            }
            System.out.println("YAAAY u looking good");
            System.out.println(Arrays.toString(arr));
        }

    }

    private static int[] initArray(int size, int initDices) {
        int arr[] = new int[size];
        indexes = new int[initDices];
        for (int i = 0; i < initDices; i++) {
            Integer a;
            do {
                a = rnd.nextInt(10);
            }
            while (Arrays.binarySearch(indexes, a) == 0);
            indexes[i] = a;
            int arrElement;
            do {
                arrElement = rnd.nextInt(7);
            } while (arrElement == 0);
            arr[a] = arrElement;
        }
        return arr;
    }

}

