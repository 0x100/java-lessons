package ru.tn.courses.dpopov.task1.v2.subtask2;

import java.util.Scanner;

/**
 * Created by P.S.InDIGO on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N =0;
        double money =0;

        System.out.println("Введите количество банков");
        N = scan.nextInt();
        System.out.println("Введите количество долларов");
        money = scan.nextDouble();

        double[] banks = new double[N];
        for(int i = 0; i < banks.length; i++ ){
            banks[i] = (double) (Math.random() * 10);
        }
            double revmoney = banks[0];

        for(int i = 1; i < banks.length; i++){
            if(banks[i] > revmoney){
                revmoney = banks[i];
            }
        }

        System.out.print(" Самая выгодня цена обмена "+money+" долларов"+" "+"="+revmoney);
    }
}
