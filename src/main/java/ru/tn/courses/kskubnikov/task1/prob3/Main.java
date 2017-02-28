package task1.prob3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Кирилл on 28.02.2017.
 */
public class Main {

    private static int arr[];
    private static int SIZE = 15;

    public static void main(String[] args) {
        arrInit();
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void arrInit(){
        arr = new int[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(SIZE);
        }
    }
}
