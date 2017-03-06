package task1.v3.subtask2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Кирилл on 06.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        boolean superHackerFlag = true;
        int arr[] = cruchuVerchu(10, 2);
        for (int i = 0; i < arr.length - 2; i++) {
            int preSum = arr[i] + arr[i + 1] + arr[i + 2];
            if (preSum >= 10) {
                superHackerFlag = !superHackerFlag;
                break;
            }
        }
        if (superHackerFlag) {
            System.out.println("KK U BROKE THIS");
        } else {
            System.out.println("NO,BRO.IT's IMPOSSIBLE");
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] cruchuVerchu(int size, int precountedDices) {
        Random rnd = new Random();
        int[] arr = new int[size];
        LinkedList<Integer> used = new LinkedList<>();
        for (int i = 0; i < precountedDices; i++) {
            Integer a;
            do {
                a = rnd.nextInt(size);
            }
            while (used.contains(a));
            used.add(a);
            int arrElement;
            do {
                arrElement = rnd.nextInt(7);
            } while (arrElement == 0);
            arr[a] = arrElement;
        }
        return arr;
    }

}
