package ru.tn.courses.ekozurev.task2;

/**
 * Created by Egor on 31.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Размеры доски (по умолчанию)
        Border borderDefault = new Border();
        int borderSizeX = borderDefault.sizeX;
        int borderSizeY = borderDefault.sizeY;

        //Размеры объявлений (по умолчанию)
        Poster posterDefault = new Poster();
        int posterSizeX = posterDefault.sizeX;
        int posterSizeY = posterDefault.sizeY;

        //Создание объекта "доска"
        Border border = new Border();

        //Количество помещающихся элементов по осям X и Y
        int kolX = 0;
        int kolY = 0;

        //Если размер объявления меньше размера доски
        if(posterSizeX <= border.sizeX && posterSizeY <= border.sizeY){
            //Находим количество объявлений по горизонтали (по оси абсцис)
            int spaseX = border.sizeX;
            spaseX = spaseX - posterSizeX;
            kolX++;

            for(int i = 1; (spaseX - (posterSizeX - 3)) >= 0; i++) {
                spaseX = spaseX - (posterSizeX - 3);
                kolX++;
            }

            //Находим количество объявлений по вертикали (по оси ординат)
            int spaseY = border.sizeY;
            spaseY = spaseY - posterSizeY;
            kolY++;

            for(int i = 1; (spaseY - (posterSizeY - 3)) >= 0; i++) {
                spaseY = spaseY - (posterSizeY - 3);
                kolY++;
            }
        }

        //Создаем двуменрый массив объявлений
        Poster[][] post = new Poster[kolY][kolX];
        for(int i = 0; i < kolY; i++)
            for(int j = 0; j < kolX; j++)
                post[i][j] = new Poster(posterSizeX, posterSizeY);

        //Нахождение количества гвоздей
        int kolGvozdei = (kolX + 1) * (kolY + 1);

        System.out.println("Размер доски объявлений: " + border.sizeX + "x" + border.sizeY);

        System.out.println("Количество объявлений по горизонтали: " + kolX + " шт.");
        System.out.println("Количество объявлений по вертикали: " + kolY + " шт.");
        System.out.println("Количество гвоздей, затраченных на крепление всех объявлений: " + kolGvozdei);
        System.out.println();

        //Координаты объявлений
        //задаем первоначальные значения для первого объявления
        int left = 0;
        int right = borderSizeX - (left + posterSizeX);
        int top = 0;
        int bottom = borderSizeY - (top + posterSizeY);

        //if(kolX != 0 && kolY != 0)
        for(int i = 0; i < kolY; i++) {
            for(int j = 0; j < kolX; j++) {
                post[i][j].top = top;
                post[i][j].left = left;
                post[i][j].bottom = bottom;
                post[i][j].right = right;
                left += (posterSizeX - 3);
                right = borderSizeX - (left + posterSizeX);
            }
            left = 0;
            right = borderSizeX - (left + posterSizeX);
            top += (posterSizeY - 3);
            bottom = borderSizeY - (top + posterSizeY);
        }

        //Вывод координат всех объявлений
        for(int i = 0; i < kolY; i++)
            for(int j = 0; j < kolX; j++){
                post[i][j].koordOut(i, j);
            }
    }
}
