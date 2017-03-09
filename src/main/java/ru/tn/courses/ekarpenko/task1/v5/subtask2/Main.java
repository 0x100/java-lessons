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
        int arr[] = new int[30];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
        }
        int up = 2;
        int down = 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                if ((a+up)>b) a=b;
                else a = a+ up;
            }
            else if (a!=0) a = a - down;
        }
        for (int l=0; l<arr.length; l++) {
        System.out.println(arr[l]);}
        System.out.println("Улитка находится в "+a+" сантиметрах над землей");
        in.close();
        }
    }



