package ru.tn.courses.vlysykh.task1.v3.subtask1.view;

import ru.tn.courses.vlysykh.task1.v3.subtask1.model.SuperArray;

/**
 * Created by Владимир on 03.03.2017.
 */
public class ConsoleView {
    private SuperArray superArray;

    public ConsoleView(SuperArray superArray) {
        this.superArray = superArray;
    }

    public void whoFirst(){
        if (superArray.isFirstPositive()) {
            System.out.println("Первое число положительное");
        } else {
            System.out.println("Первое число отрицательное");
        }
    }

    public SuperArray getSuperArray() {
        return superArray;
    }
}
