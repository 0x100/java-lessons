package task1.v4.subtask1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Кирилл on 28.02.2017.
 */
public class Main {

    private static int[ ] arr;
    private static final int SIZE = 10;
    private static boolean flag = true;

    public static void main(String[] args) {
        arrInit();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Incr?: " + flag );
    }

    private static void arrInit(){
        arr = new int[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(SIZE);
        }
    }
}
