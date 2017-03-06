package main.java.ru.tn.courses.dmakoshenko.task1.v2.subtask3;

/**
 * Created by Danil on 02.03.2017.
 */
public class subtask3 {
    public static void main(String[] args){
        int[] a = new int[20];
        for (int i= 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        for (int i= 0; i < a.length; i++) {
            int numMax = i;
            for (int j = i+1; j < a.length; j++){
                if (a[numMax] < a[j]) numMax = j;
            }
            if (numMax != i){
                int temp = a[numMax];
                a[numMax] = a[i];
                a[i] = temp;
            }
        }
        for (int i= 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
