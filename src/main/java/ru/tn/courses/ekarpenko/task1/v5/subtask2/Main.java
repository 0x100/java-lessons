package ru.tn.courses.ekarpenko.task1.v5.subtask2;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Eduard on 05.03.2017.
 */
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту дерева (в метрах)...");
        int b = in.nextInt() * 100;//переводим высоту дерева в сантиметры
        System.out.println("Введите расстояние от улитки до земли (в сантиметрах)...");
        int a = in.nextInt();
        int s = a;
        int arr[] = new int[30];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {//создаем массив из 0 и 1
            arr[i] = rand.nextInt(2);//0 - пасмурный день, 1 - солнечный
        }

        if (b<a) System.out.println("Ошибка!");
        else {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 & s>=1) {
                s = s-1;
            } else if (arr[i] == 1 & s<b) {
                s = s+1;
                if (s<b) {
                    s=s+1;
                }
            }
        }
        System.out.println("Улитка находится в "+s+" сантиметрах над землей");
        in.close();
        }
    }
}


