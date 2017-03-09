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
        boolean hack1, hack2;
        int i_right, i_left;
        hack1 = hack2 = true;
        i_left = i_right = pos;
        do {
            if (i_left - 3 >= 0) {
                i_left -= 3;
                arr[i_left] = arr[pos];
            }
            else hack1 = false;

            if (i_right + 3 < arr.length){
                i_right += 3;
                arr[i_right] = arr[pos];
            }
            else hack2 = false;
        }
        while (hack1 || hack2);
        return arr;
    }

    private void print (int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    private int myRand (int from, int to) {
        return from + (int) (Math.random() * to);
    }

    private int[] initLock (int SIZE) {
        boolean hackLock;
        int [] arr = new int[SIZE];
        int cube1, cube2, pos;
        do {
            do {
                for (int i = 0; i < arr.length; i++) arr[i] = 0;
                pos = myRand(0, SIZE - 1);
                cube1 = myRand(1, 6);
                engaged[0] = pos;
                arr[pos] = cube1;
                do
                    pos = myRand(0, SIZE - 1);
                while (engaged[0] == pos);
                cube2 = myRand(1, 6);
                engaged[1] = pos;
                arr[pos] = cube2;
            }
            while (SIZE - cube1 - cube2 < 6);
            hackLock = Math.abs(engaged[0] - engaged[1]) == 0 || Math.abs(engaged[0] - engaged[1]) == 1 || Math.abs(engaged[0] - engaged[1]) % 4 == 0;
        }
        while (!hackLock);
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
        System.out.println("Current lock: ");
        obj.print(lock);

        System.out.println("Hack lock: ");
        lock = obj.hack(lock);
        obj.print(lock);

    }
}
