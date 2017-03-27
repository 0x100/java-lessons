
package ru.tn.courses.kzholumskiy.task1.v2.subtask3;

/**
 * Created by MAG on 12.03.2017.
 */
public class Main {

    public static void  main(String args[]){

        int n = 10;
        double Array[] = new double[n];

        // генерирование элементов исходного массива
        int k = 10;
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            Array[i] = Math.random() * k;
            System.out.print(Array[i] + " ");
        }

        // сортировка выбором
        for (int i = 0; i < n; i++) {

            double max = 0;
            int poz = 0;

            // поиск максимального элемента
            for (int j = i; j < Array.length; j++) {
                if (Array[j] > max) {
                    max = Array[j];
                    poz = j;
                }
            }

            // обмен значениями i-го и max элементов
            double temp = Array[i];
            Array[i] = max;
            Array[poz] = temp;


        }

        // Вывод результирующего массива
        System.out.println(" ");
        System.out.print("Result array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }

        
    }

}

