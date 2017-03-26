package ru.tn.courses.ksamcharadze.task1.subtask4;

import java.util.Scanner;

/**
 * Created by Коба on 12.03.2017.
 *
 * На вход подаётся строка, необходимо определить подстроку с наибольшей длиной,
 * которая встречается в исходной строке наибольшее количество раз.
 * Результат: вывод этой подстроки и количество вхождений.
 */

public class Main {
    public static void main(String[] args) {

        int minLen = 3;
        Scanner input = new Scanner(System.in);
        String str = new String();

        do {
            System.out.print("Enter string (min length is " + minLen + "): ");
            str = input.nextLine();
        } while (str.length() < minLen);

        String subStr = new String();
        String bigSubStr = new String();
        String searchSubStr = new String();
        int maxCoin = 0;

        System.out.println("Max length");
        for (int subStrLen = 2, coincidence, bigCoincidence; subStrLen < str.length(); subStrLen++) {

            bigCoincidence = 0;
            bigSubStr = subStr = str.substring(0, subStrLen);
            for (int j = 0; j < str.length() - subStr.length(); j++) {
                coincidence = 0;
                for (int i = 0; i < str.length() - subStr.length() + 1; i++)
                    if (subStr.equals(str.substring(i, subStrLen + i)))
                        coincidence++;
                if (bigCoincidence < coincidence) {
                    bigCoincidence = coincidence;
                    bigSubStr = subStr;
                }
                subStr = str.substring(j, subStrLen + j);
            }
            if (bigCoincidence >= maxCoin && bigSubStr.length() > searchSubStr.length()) {
                searchSubStr = bigSubStr;
                maxCoin = bigCoincidence;
            }
            System.out.println("\tfrom " + bigSubStr.length() + ": " + bigSubStr + " - " + bigCoincidence);
        }
        System.out.println("More coincidence: " + searchSubStr + "\nAmount: " + maxCoin);

    }
}

