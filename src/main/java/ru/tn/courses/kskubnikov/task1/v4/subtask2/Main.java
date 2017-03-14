package task1.v4.subtask2;

import java.util.Random;

/**
 * Created by Кирилл on 28.02.2017.
 */
public class Main {

    private static int[ ] arr;
    private static final int SIZE = 25;
    public static final int BOUND = 12;

    public static void main(String[] args) {
        arrInit();
        int i = 1;
        while(i < arr.length){
            System.out.print(i + ":" + arr[i] + " ");
            i = i<<1;
        }
    }

    private static void arrInit(){
        arr = new int[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(BOUND);
        }
    }
}
