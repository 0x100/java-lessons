package task1.v3.subtask2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static Random rnd = new Random();
    public static int indexes[];

    public static void main(String[] args) {
        boolean fail = false;
        int[] sequence = new int[3];
        int[] arr = initArray(10, 2);
        if ((indexes[0] % 3 == indexes[1] % 3) && (arr[indexes[0]] != arr[indexes[1]])) {
            fail = true;
        }
        for (int i = 0; i < indexes.length; i++) {
            sequence[indexes[i] % 3] = arr[indexes[i]];

        }
        System.out.println(Arrays.toString(sequence));
        LinkedList<Integer> zeroIndexes = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == 0) {
                zeroIndexes.add(i);
            }
            sum += sequence[i];
        }
        if (sum > 9) {
            fail = true;
        }
        if (zeroIndexes.size() == 1) {
            sequence[zeroIndexes.get(0)] = 10 - sequence[0] - sequence[1] - sequence[2];
            if (sequence[zeroIndexes.get(0)] > 6) {
                fail = true;
            }
        } else {
            int preSum = 10 - sequence[0] - sequence[1] - sequence[2];
            sequence[zeroIndexes.get(0)] = preSum / 2;
            sequence[zeroIndexes.get(1)] = (int) Math.ceil((double) preSum / (double) 2);
        }
        System.out.println(Arrays.toString(arr));
        if (fail) {
            System.out.println("NONONO BROH");
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sequence[i % 3];
            }
            System.out.println("YAAAY u looking good");
            System.out.println(Arrays.toString(sequence));
            System.out.println(Arrays.toString(arr));
        }

    }

    private static int[] initArray(int size, int initDices) {
        int arr[] = new int[size];
        indexes = new int[initDices];
        LinkedList<Integer> used = new LinkedList<>();
        for (int i = 0; i < initDices; i++) {
            Integer a;
            do {
                a = rnd.nextInt(10);
            }
            while (used.contains(a));
            used.add(a);
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

