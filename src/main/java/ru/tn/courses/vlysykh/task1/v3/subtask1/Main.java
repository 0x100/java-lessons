package ru.tn.courses.vlysykh.task1.v3.subtask1;

import ru.tn.courses.vlysykh.task1.v3.subtask1.model.SuperArray;
import ru.tn.courses.vlysykh.task1.v3.subtask1.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        ConsoleView view = new ConsoleView(new SuperArray(20,100));
        view.getSuperArray().showArray();
        view.whoFirst();
    }
}
