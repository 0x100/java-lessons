package ru.tn.courses.ksamcharadze.task1.v3.subtask2;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Коба on 09.03.2017.
 * Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек,
 * в которые надо вставить игральные кубики.
 * Но дверь открывается только в том случае,
 * когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек.)
 * Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */

public class Main {

    private int [] engaged = new int [2];

    int[] hackProc (int [] arr, int pos) {
        boolean [] hack = new boolean[2];
        int i_right, i_left;
        hack[0] = hack[1] = true;
        i_left = i_right = pos;
        do {
            if (i_left - 3 >= 0) {
                i_left -= 3;
                arr[i_left] = arr[pos];
            }
            else hack[0] = false;
            if (i_right + 3 < arr.length){
                i_right += 3;
                arr[i_right] = arr[pos];
            }
            else hack[1] = false;
        }
        while (hack[0] || hack[1]);
        return arr;
    }

    private int myRand (int from, int to) {
        return from + (int) (Math.random() * to);
    }

    private int[] initLock (int SIZE) {
        boolean hackLock;
        int fullSum = 10;
        int [] arr = new int[SIZE];
        int [] pos = new int[2];
        int [] cube = new int[2];
        do {
            do {
                pos[0] = myRand(0, SIZE - 1);
                cube[0] = myRand(1, 6);
                do
                    pos[1] = myRand(0, SIZE - 1);
                while (pos[0] == pos[1]);
                cube[1] = myRand(1, 6);
            }
            while (!(1 <= fullSum - cube[0] - cube[1] && fullSum - cube[0] - cube[1] <= 6));
            hackLock = Math.abs(pos[0] - pos[1]) == 0 || Math.abs(pos[0] - pos[1]) == 1 || Math.abs(pos[0] - pos[1]) % 4 == 0;
        }
        while (!hackLock);
        arr[pos[0]] = cube[0]; engaged[0] = pos[0];
        arr[pos[1]] = cube[1]; engaged[1] = pos[1];
        return arr;
    }

    private int[] hack (int [] arr) {
        arr = hackProc(arr, engaged[0]);
        arr = hackProc(arr, engaged[1]);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr [i] = 10 - arr[engaged[0]] - arr[engaged[1]];
        return arr;
    }

    public static void main(String[] args) {

        int SIZE = 10;
        int [] lock;

        Main obj = new Main();
        lock = obj.initLock(SIZE);
        System.out.print("Current lock: ");
        System.out.println(Arrays.toString(lock));

        System.out.print("Hack lock:    ");
        lock = obj.hack(lock);
        System.out.println(Arrays.toString(lock));;

    }
}
