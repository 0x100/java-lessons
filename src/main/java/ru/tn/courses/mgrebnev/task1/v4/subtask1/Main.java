import java.util.Random;

/**
 * Created by Max on 01.03.2017.
 */
public class Main {

    /** Возвращает массив с случайными действительными числами в некотором заданном диапазоне
        @param min минимальное число диапазона
        @param max максимальное число диапазона
        @param n длина массива
        @return Массив случайных действительных чисел
     */

    static float[] setRandomArray(float min,float max,int n){

        float[] arr = new float[n];
        Random r = new Random();

        System.out.print("Arr = ");

        for( int i = 0; i < arr.length; i++){
            arr[i] = r.nextFloat() * (max - min) + min;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    /**
       Фукнция проверяет возрастает ли последоватльность
       @param a массив который надо проверить
       @return true если возрастает, в противном случае - false
     */

    static boolean isProgressArray(float a[]){
        for ( int i = 0; i < a.length-1; i++){
            if (a[i+1] - a[i] <= 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isProgressArray(setRandomArray(60f,30f,3)));
    }
}
