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

    /** Возводит число a в степень n
     @param a основание
     @param n степень
     @return a^n
     */
    static int power(int a,int n){
        if (n == 0){
            return 1;
        }else {
            return power(a,n-1)*a;
        }
    }

    public static void main(String[] args){

        int n = 10;
        int a[] = setRandomArray(10,40,n);

        int i = 0;

        System.out.println();

        while(power(2,i) < n){
            System.out.println("Arr[2 ^ " + i + "] = " + a[power(2,i)]);
            i++;
        }

    }
}
