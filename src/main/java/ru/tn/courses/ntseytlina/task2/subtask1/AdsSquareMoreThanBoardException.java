package ru.tn.courses.ntseytlina.task2.subtask1;


class AdsSquareMoreThanBoardException extends Exception {
    AdsSquareMoreThanBoardException() {
        super("Все объявления не помещаются на доску");
    }

    public AdsSquareMoreThanBoardException(String message) {
        super("Все объявления не помещаются на доску. " + message + "\n");
    }
}