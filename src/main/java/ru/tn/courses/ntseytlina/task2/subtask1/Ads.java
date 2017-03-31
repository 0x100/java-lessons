package ru.tn.courses.ntseytlina.task2.subtask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ads {
    private List<BoardPoint> ads;
    private List<BoardPoint> pins;
    private int width, height;
    private int number;
    private int boardWidth, boardHeight;

    private Ads (int number, int width, int height) {
        this.number = number;
        this.width = width;
        this.height = height;
    }

    public void fillAdsForBounds (int x, int y) throws AdsSquareMoreThanBoardException {
        boardWidth = x;
        boardHeight = y;
        ads = new ArrayList<>();
        pins = new ArrayList<>();
        int columnsInBoard = (x - 3) / (width - 3);
        int rowsInBoard = (y - 3) / (height - 3);
        boolean toLeft = true;

        /*System.out.println("Columns in board " + columnsInBoard);
        System.out.println("Rows in board " + rowsInBoard);*/

        int normalizedNumber = number;
        if (number % 2 == 1) {
            normalizedNumber--;
            if (columnsInBoard < rowsInBoard) {
                rowsInBoard--;
                toLeft = false;
            } else {
                columnsInBoard--;
                toLeft = true;
            }
        }

        int minimumColumns = 0, minimumRows = 0, difference = columnsInBoard;
        for (int i = 1; i <= columnsInBoard; i++) {
            int tempMinimumColumns = i;
            int tempMinimumRows = normalizedNumber / tempMinimumColumns;

            if (normalizedNumber % tempMinimumColumns == 0
                    && Math.abs(tempMinimumColumns - tempMinimumRows) <= difference
                    && tempMinimumRows <= rowsInBoard) {
                minimumColumns = tempMinimumColumns;
                minimumRows = tempMinimumRows;
                difference = Math.abs(tempMinimumColumns - tempMinimumRows);
            }
        }

        if (minimumColumns == 0 || minimumRows == 0) {
            String message = "Размер доски: " + boardWidth + " x " + boardHeight + ". ";
            message += "Количество объявлений: " + number + ". ";
            message += "Размер объявлений: " + width + " x " + height + ".";
            throw new AdsSquareMoreThanBoardException(message);
        }

        for (int i = 0; i < minimumRows; i++) {
            for (int j = 0; j < minimumColumns; j++) {
                ads.add(new BoardPoint((width - 3) * j + 1, (height - 3) * i + 1));
            }
        }

        for (int i = 0; i <= minimumRows; i++) {
            for (int j = 0; j <= minimumColumns; j++) {
                pins.add(new BoardPoint((width - 3) * j + 2, (height - 3) * i + 2));
            }
        }

        if (number % 2 == 1) {
            if (toLeft) {
                minimumColumns++;
                ads.add(new BoardPoint((width - 3) * (minimumColumns - 1) + 1, 1));
                pins.add(new BoardPoint((width - 3) * minimumColumns + 2, 2));
                pins.add(new BoardPoint((width - 3) * minimumColumns + 2, height - 1));
            } else {
                minimumRows++;
                ads.add(new BoardPoint(1, (height - 3) * (minimumRows - 1) + 1));
                pins.add(new BoardPoint(2, (height - 3) * minimumRows + 2));
                pins.add(new BoardPoint(width - 1, (height - 3) * minimumRows + 2));
            }
        }

        /*System.out.println("Minimum columns " + minimumColumns);
        System.out.println("Minimum rows " + minimumRows);*/

        Collections.sort(ads);
        Collections.sort(pins);
    }

    @Override
    public String toString() {
        String string = "Размер доски: " + boardWidth + " x " + boardHeight + "\n";
        string += "Количество объявлений: " + number + "\n";
        string += "Размер объявлений: " + width + " x " + height + "\n";
        string += "Количество гвоздей: " + pins.size() + "\n";
        string += "Координаты гвоздей:\n";
        for (BoardPoint pin : pins) {
            string += pin + "\n";
        }
        string += "Координаты объявлений:\n";
        for (BoardPoint ad : ads) {
            string += ad + "\n";
        }
        string += "\n";
        return string;
    }
}
