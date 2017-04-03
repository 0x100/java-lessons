package ru.tn.courses.ptihomirov.task2.v1.subtask1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Павел on 02.04.2017.
 */
public class Main
{
    static List <Sticker> listSticker = new ArrayList <Sticker>();
    static List <Tack> listTack = new ArrayList <Tack>();

    static int A = 100; // Длина доски
    static int B = 100; // Ширина доски
    static int N = 5; // Число объявлений
    static int Cn = A / 5; // Длина объявления
    static int Dn = B / 5; // Ширина объявления

    public static void main(String args[])
    {
        int left = 0; // Расстояние от левой границы доски до левой границы объявления
        int top = 0; // Расстояние от верхней границы доски до верхней границы объявления
        int right = A - Cn; // Расстояние от правой границы доски до правой границы объявления
        int bottom = B - Dn; // Расстояние от нижней границы доски до нижней границы объявления

        // Координаты гвоздя
        int x = 3;
        int y = B - 2;

        int countRows = A * N / (Cn + ((Cn - 3) * (N - 1))); // Число объявлений, которое вмещается в длинну доски
        int countCols = A * N / (Dn + ((Dn - 3) * (N - 1))); // Число объявлений, которое вмещается в ширину доски

        // Расстановка объявлений
        for(int i = 0; i < countRows; i++)
        {
            for(int j = 0; j < countCols; j++)
            {
                listSticker.add(new Sticker(left, top, right, bottom));
                left += Cn - 3;
                right -= Cn - 3;
            }
            // Переход на следующую строку
            left = 0;
            right = A - Cn;
            top += Dn - 3;
            bottom -= Dn - 3;
        }

        // Забивание гвоздей
        int xPrev;
        int yPrev;
        for(int i = 1; i < listSticker.size(); i++)
        {
            listTack.add(new Tack(x, y));

            xPrev = x;
            yPrev = y;

            left = listSticker.get(i).left;
            top = listSticker.get(i).top;

            x = left + 3;
            y = B - top - 2;

            if (yPrev != y)
            {
                listTack.add(new Tack(xPrev + 15, yPrev));
            }
            if (i == listSticker.size() - 1)
            {
                listTack.add(new Tack(x, y));
                listTack.add(new Tack(x + 15, yPrev));
                x = 3;
                y -= 17;
                for(int j = 0; j < countRows + 1; j++)
                {
                    if (j == countRows)
                    {
                        listTack.add(new Tack(x - 2, y));
                        break;
                    }
                    listTack.add(new Tack(x, y));
                    x += 17;
                }
            }
        }
        System.out.println("Необходимое число гвоздей: " + listTack.size() + ";");
        System.out.println("\n");
        showTacks();
        System.out.println("\n");
        showStickers();
    }
    static void showStickers()
    {
        for(int i = 0; i < listSticker.size(); i++)
        {
            System.out.println("Объявление № " + (i + 1) + " {" +
                    listSticker.get(i).left +
                    ", " +
                    listSticker.get(i).top +
                    ", " +
                    listSticker.get(i).right +
                    ", " +
                    listSticker.get(i).bottom + "};");
        }
    }
    static void showTacks()
    {
        for(int i = 0; i < listTack.size(); i++)
        {
            System.out.println("Гвоздь № " + (i + 1) + " [" +
                    listTack.get(i).x +
                    ", " +
                    listTack.get(i).y + "];");
        }
    }
}
