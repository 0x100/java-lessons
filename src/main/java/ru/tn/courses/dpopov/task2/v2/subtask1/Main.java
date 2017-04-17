package ru.tn.courses.dpopov.task2.v2.subtask1;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by P.S.InDIGO on 28.03.2017.
 */
public class Main {
    public static int xtable = 0;
    public static int ytable = 0;
    public static int xlabel = 0;
    public static int ylabel = 0;
    public static int n = 0;
    public static char[][] table;
    public static int[] rast;

    public static void main(String[] args) {
        Vvod();
        Razmeshenie();
        Vivod();

    }

    public static void Vvod(){
        Scanner scan = new Scanner(System.in);
        while(xtable < 100){
        System.out.println("Введите длину доски объявлений, больше или равной 100");
        xtable = scan.nextInt();
        }
        while(ytable < 100){
        System.out.println("Введите высоту доски объявлений, больше или равной 100");
        ytable = scan.nextInt();
        }
        while(xlabel < (xtable / 5)) {
            System.out.println("Введите длину объявления, больше или равную "+xtable/5);
            xlabel = scan.nextInt();
        }
        while (ylabel < (ytable / 5)) {
            System.out.println("Введите высоту объявления, больше или равную "+ytable/5);
            ylabel = scan.nextInt();
        }
        while (n < 5) {
            System.out.println("Введите количество объявлений больше и равное 5");
            n = scan.nextInt();
        }
    }

    public static void Razmeshenie() {
        table = new char[xtable][ytable];
        rast = new int[n*4];
        int countLabel = 0;
        int rastCheck = 0;



        for (int y = 0; y < table[0].length; y += ylabel - 3) {
            for (int x = 0; x < table.length; x += xlabel - 3) {
                //цикл прохождения по всей доске с шагом в длину и высоту объявления
                //
                //
                char rc = (char) ('A' + new Random().nextInt(26));


                if(countLabel < n) {
                    if ((y + (ylabel - 3)) < ytable) {
                        for (int y2 = y; y2 < (y + ylabel) && (y2 < table[0].length); y2++) {
                            if ((x + (xlabel - 3)) < xtable) {
                                for (int x2 = x; x2 < (x + xlabel) && (x2 < table.length); x2++) {
                                    // Посчет количества объявлений
                                    //
                                    //
                                    if(x2 == x && y2 == y){
                                        countLabel++;
                                    }

                                    table[x2][y2] = rc; // Заполнение массива объявлений

                                    // Условие расстановки кнопок
                                    //
                                    //
                                    if((x2 == x+1 && y2 == y+1) || ((x2 == (x + xlabel - 2) && (y2 == y+1)))){
                                        table[x2][y2] = '*';
                                    } else if ((x2 == x+1 && y2 == (y + ylabel - 2)) || (x2 == (x +xlabel - 2) && y2 == (y + ylabel - 2))){
                                        table[x2][y2] = '*';
                                    }
                                    // Условие записи расстояния от края таблицы до UP, LEFT, RIGHT, BOTTOM
                                    //
                                    //
                                    if(((x2 == (x + (xlabel/2))) && (y2 == y))) {
                                        rast[rastCheck++] = y2;
                                    } else if ((x2 == x) && (y2 == (y + (ylabel/2)))){
                                        rast[rastCheck++] = x2;
                                    } else if ((x2 == ((x + xlabel)-1)) && (y2 == (y + (ylabel/2)))){
                                        rast[rastCheck++] = (table.length - x2 - 1);
                                    } else if ((y2 == ((y + ylabel)-1)) && (x2 == (x + (xlabel/2)))){
                                        rast[rastCheck++] = (table[0].length - y2 - 1);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static int Knopki(char[][] table){
        int knopki = 0;
        // Подсчет кнопок (Ходит только по тем элементам где должны быть точки) 1 объявление проверка 4х элементов
        //
        //
        for(int y = 1; y < table[0].length ; y +=(ylabel - 3)){
            for(int x = 1; x < table.length; x+=(xlabel - 3)){
                 if(table[x][y] == '*'){
                     knopki++;
                 }
            }
        }
        return knopki;
    }

    public static void Vivod(){
        Scanner scan = new Scanner(System.in);
        String tablica;
        System.out.println("");
        System.out.println("Количество кнопок = "+Knopki(table));
        System.out.println("Координаты:");
        System.out.print("[]-Up, []-Left, []-Right, []-Bottom");
        for(int i = 0; i < rast.length; i++){
            if((i % 4) == 0){
                System.out.println();
                System.out.print("Объявление номер"+(i/4+1)+"  ");
            }
            System.out.print(" "+rast[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Вывести доску объявлений в виде матрицы ? yes/no .....");
        tablica = scan.nextLine();
        if(tablica.equalsIgnoreCase("yes")) {
            for (int i = 0; i < table[0].length; i++) {
                System.out.println("");
                for (int j = 0; j < table.length; j++) {
                    System.out.print(table[j][i]);
                }
            }
        }

    }



}
