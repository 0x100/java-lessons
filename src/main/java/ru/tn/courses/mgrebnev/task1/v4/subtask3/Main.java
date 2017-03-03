/**
 * Created by Max on 01.03.2017.
 */
import java.util.Random;

public class Main {
    /** Возвращает массив с случайными целыми числами в некотором заданном диапазоне
     @param min минимальное число диапазона
     @param max максимальное число диапазона
     @param n длина массива
     @return Массив случайных целых чисел
     */

    static int[] setRandomArray(int min,int max,int n){
        int[] arr = new int[n];
        Random r = new Random();

        System.out.print("Arr = ");

        for( int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(max - min) + min;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    /** Сортировка массива вставками
     *
     * @param a массив который нужно отсортировать
     * @return отсортированный массив
     */
    static int[] insertSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int place = i;
            for (int j = i; j >= 0; j--){
                if ( a[j] > temp){
                    a[j+1] = a[j];
                    place = j;
                }
            }
            a[place] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int b[] = insertSort(setRandomArray(0,30,10));

        System.out.print("\nSort Arr =  ");

        for(int value : b){
            System.out.print(value + " ");
        }

    }
}
