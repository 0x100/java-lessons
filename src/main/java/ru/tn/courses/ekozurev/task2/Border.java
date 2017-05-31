package ru.tn.courses.ekozurev.task2;

/**
 * Created by Egor on 31.05.2017.
 */
public class Border extends Poster{
    public int sizeX, sizeY;

    //Конструктор по умолчанию
    Border(){
        this.sizeX = 39;
        this.sizeY = 24;
    }
    //Конструктор с параметрами
    Border(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
