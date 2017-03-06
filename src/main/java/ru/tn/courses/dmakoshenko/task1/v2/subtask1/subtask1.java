package main.java.ru.tn.courses.dmakoshenko.task1.v2.subtask1;

import java.util.ArrayList;

/**
 * Created by Danil on 02.03.2017.
 */
public class subtask1 {
    public static void main(String[] args){
        int[] array = new int[20];
        for (int i= 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        ArrayList<Integer> nullItems = new ArrayList<Integer>();

        for (int i= 0; i < array.length; i++) {
            if (array[i] == 0) {
                nullItems.add(i);
            }
        }
        if (nullItems.size() > 0) {
            System.out.println("\nНомера нулевых элементов: ");
            for (int item : nullItems) {
                System.out.print(item + " ");
            }
        }
        else {
            System.out.println("\nНулевые эелементы отсутсвуют");
        }
    }
}
