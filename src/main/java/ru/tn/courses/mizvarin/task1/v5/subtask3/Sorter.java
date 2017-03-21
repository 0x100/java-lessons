package ru.tn.courses.mizvarin.task1.v5.subtask3;

/**
 * Created by Макс on 12.03.2017.
 * Функция сортировки для задания 3
 */
public class Sorter {
    int[] mass;

    public Sorter(int[] mass){
        this.mass = mass;
    }

    public int[] ShellSort(){
        int i = 0;
        int c;
        while(i < mass.length-1) {
            if (mass[i] <= mass[i+1]){
                i++;
            }else {
                if (i == 0){
                    c = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = c;
                    i++;
                } else{
                    c = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = c;
                    i--;
                }
            }
        }
        return mass;
    }
}
