
package ru.tn.courses.kzholumskiy.task1.v2.subtask1;

/**
 * Created by MAG on 12.03.2017.
 */
public class Main {

    public static void  main(String args[]){

        int Array[] = {0, 30, 67, 0, 43, 0, 56, 0}; // дан массив целых чисел

        // Подсчёт числа нулевых элементов
        int num = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] == 0) num++;
        }

        int Numbers[] = new int[num]; // массив номеров нулевых элементов
        int poz = 0;

        // Поиск нулевых элементов и запись их номеров
        for(int i = 0; i < Array.length; i++){
            if(Array[i] == 0){
                Numbers[poz] = i;
                poz++;
            }
        }

        // Вывод номеров нулевых элементов
        System.out.print("Numbers of zero elements: ");
        for(int i = 0; i < Numbers.length; i++){
            System.out.print(Numbers[i] + " ");
        }

    }
}
