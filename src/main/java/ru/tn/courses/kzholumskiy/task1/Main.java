/**
 * Created by MAG on 02.04.2017.
 */
package ru.tn.courses.zholumskiy.task2.v2.subtask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List <Obyavlenie> lObyavlenie = new ArrayList<Obyavlenie>();
    static List <Gvozd> lGvozd = new ArrayList <Gvozd>();

    static int A = 300;
    static int B = 300;
    static int N = 10;
    static int Cn = A / 5;
    static int Dn = B / 5;

    public static void main(String args[])
    {
        //объявление
        int top = 0;
        int right = A - Cn;
        int bot = B - Dn;
        int left = 0;
        //гвоздь
        int x = 3;
        int y = B - 2;

        int height = A * N / (Cn + ((Cn - 3) * (N - 1))); // количество объявлений по всей длинне доски
        int width = A * N / (Dn + ((Dn - 3) * (N - 1))); // количество объявлений по всей ширине доски

        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                lObyavlenie.add(new Obyavlenie(left, top, right, bot));
                left = left + Cn - 3;
                right = right - Cn - 3;
            }
            left = 0;
            right = A - Cn;
            top = top + Dn - 3;
            bot = bot - Dn - 3;
        }

        int BeforeX;
        int BeforeY;
        for(int i = 1; i < lObyavlenie.size(); i++)
        {
            lGvozd.add(new Gvozd(x, y));

            BeforeX = x;
            BeforeY = y;

            left = lObyavlenie.get(i).left;
            top = lObyavlenie.get(i).top;

            x = left + 3;
            y = B - top - 2;

            if (BeforeY != y)
            {
                lGvozd.add(new Gvozd(BeforeX + 15, BeforeY));
            }
            if (i == lObyavlenie.size() - 1)
            {
                lGvozd.add(new Gvozd(x, y));
                lGvozd.add(new Gvozd(x + 15, BeforeY));
                x = 3;
                y = y - 17;
                for(int j = 0; j < height + 1; j++)
                {
                    if (j == height)
                    {
                        lGvozd.add(new Gvozd(x - 2, y));
                        break;
                    }
                    lGvozd.add(new Gvozd(x, y));
                    x += 17;
                }
            }
        }

        showlGvozd();
        showlObyavlenie();
        System.out.println("Число гвоздей: " + lGvozd.size() + ";");
    }
    static void showlObyavlenie()
    {
        for(int i = 0; i < lObyavlenie.size(); i++)
        {
            System.out.println("Объявление номер " + (i + 1) + " {" +
                    lObyavlenie.get(i).left +
                    ", " +
                    lObyavlenie.get(i).top +
                    ", " +
                    lObyavlenie.get(i).right +
                    ", " +
                    lObyavlenie.get(i).bot +
                    "};");
        }
    }
    static void showlGvozd()
    {
        for(int i = 0; i < lGvozd.size(); i++)
        {
            System.out.println("Гвоздь номер " + (i + 1) + " [" +
                    lGvozd.get(i).x +
                    ", " +
                    lGvozd.get(i).y +
                    "];");
        }
    }
}
