package ru.tn.courses.vlysykh.task1.v3.subtask3;

import ru.tn.courses.vlysykh.task1.v3.subtask3.model.BadArray;

/**
 * Created by ElemenT87 on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        BadArray badArray = new BadArray(25,1000);
        badArray.showArray();

        badArray.bubbleSortArray();
        badArray.showArray();

    }
}
