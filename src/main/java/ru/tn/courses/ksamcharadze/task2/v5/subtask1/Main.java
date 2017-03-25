package ru.tn.courses.ksamcharadze.task2.v5.subtask1;

import java.util.*;

/**
 * Created by Коба on 23.03.2017.
 *
 * На доске объялений размера A x B требуется разместить N объявлений размером Сn x Dn.
 * Объявления необходимо закрепить гвоздиками таким образом,
 * чтобы каждое объявление удерживалось четырьмя гвоздями.
 * Один гвоздик может прокалывать несколько оъявлений.
 * Объявление при этом накладывается на другое на расстояние в 3 точки.
 * Прокол делается на расстоянии в 2 точки от края листа.
 *
 * Задача в том, чтобы закрепить объявления, затратив при этом минимально возможное количество гвоздиков.
 * При написании программы необходимо использовать объектно-ориентированный подход.
 *
 * Результатом являются количество необходимых гвоздей, и координаты объявлений и гвоздей.
 *
 * A, B >= 100
 * N >= 5
 * Cn <= A / 5
 * Dn <= B / 5
 *
 * Диаметр гвоздика - 1 точка.
 *
 */

class BoardException extends Exception {
    BoardException (String massage) {
        super(massage);
    }
}

public class Main {

    private int sizeBoardX;
    private int sizeBoardY;
    private int numbAdvert;
    private int sizeAdvertX;
    private int sizeAdvertY;
    private int posNail = 2;
    private int countNail = 0;
    private int countAdvert = 0;
    private int doubleNail;

    private char [][] board;
    private Map<String, String> adverts = new HashMap<>();
    private Map<String, String> nails = new HashMap<>();

    private void initBoard() {
        int X = sizeBoardX;
        int Y = sizeBoardY;
        board = new char[X][Y];
        for (int i = 0; i < X; i++)
            for (int j = 0; j < Y; j++)
                board[i][j] = ' ';
    }

    private Main() throws BoardException {

        int minSizeBoard = 100;
        int minNumdAdvert = 5;

        Scanner input = new Scanner(System.in);  posNail--;
        do {
            System.out.println("Enter size board (min " + minSizeBoard + "x" + minSizeBoard +"): ");
            sizeBoardX = input.nextInt();
            sizeBoardY = input.nextInt();
        } while (sizeBoardX < minSizeBoard || sizeBoardY < minSizeBoard);

        do {
            System.out.println("Enter number advert (min " + minNumdAdvert + "): ");
            numbAdvert = input.nextInt();
        } while (numbAdvert < minNumdAdvert);

        do {
            System.out.println("Enter size board (min 5x5, max " + (sizeBoardY / 5 ) + "x" + (sizeBoardX / 5 ) + "): ");
            sizeAdvertX = input.nextInt();
            sizeAdvertY = input.nextInt();
        } while (sizeAdvertX > sizeBoardX / 5 || sizeAdvertY > sizeBoardY / 5);

        int numRow = (sizeBoardY - 3) / (sizeAdvertY - 3);
        int numColl = (sizeBoardX - 3) / (sizeAdvertX - 3);
        int maxNumAdv = numRow * numColl;
        if (maxNumAdv < numbAdvert)
            throw new BoardException("\tError: You can not post on the board (" + sizeBoardX + "x" + sizeBoardY +") " + numbAdvert +" advert sizes of " + sizeAdvertX + "x" + sizeAdvertY);
        int numAdvNotFullRow = numbAdvert - maxNumAdv;
        doubleNail = maxNumAdv - numColl + numAdvNotFullRow;

    }

    private void addAdOnBoard (int fromY, int toY, int fromX, int toX) {
        countAdvert++;
        String advs = new String("0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
        char advert = advs.charAt(new Random().nextInt(advs.length()));
        for (int j = fromY; j < toY; j++) for (int k = fromX; k < toX; k++) board[k][j] = advert;
        adverts.put("\tAdvert № " + countAdvert + ": ",
                    "(" + (fromY + 1) + "," + (fromX + 1) + ") - (" + toY + "," + toX + ")");
    }

    private void addNailOnBoard (int x, int y) {
        countNail++;   board[x][y] = '+';
        nails.put("(" + (y + 1) + "," + (x + 1) + ")", "\tNail №" + countNail);
    }

    private void addAdsOnBoard() {
        for (int fromX = 0, toX = 0; toX < sizeBoardX && countAdvert < numbAdvert; fromX += sizeAdvertX - 3) {
            int fromY, toY; fromY = toY = 0;
            for (fromY = 0, toY = 0; toY < sizeBoardY && countAdvert < numbAdvert; fromY += sizeAdvertY - 3) {
                toX = fromX + sizeAdvertX;
                toY = fromY + sizeAdvertY;
                if (toY > sizeBoardY || toX > sizeBoardX) break;
                addAdOnBoard(fromY, toY, fromX, toX);
                addNailOnBoard(fromX + posNail, fromY + posNail);
                if (countAdvert > doubleNail)
                    addNailOnBoard(toX - posNail - 1, fromY + posNail);
            }
            addNailOnBoard(fromX + posNail, fromY + posNail);
            if (countAdvert > doubleNail)
                addNailOnBoard(toX - posNail - 1, fromY + posNail);
        }
    }

    private void printData () {
        System.out.println("\nCoordinates of adverts points:");
        for (Map.Entry<String, String> advert: adverts.entrySet())
            System.out.println(advert.getKey() + ": " + advert.getValue());

        System.out.println("\nAmount of nails: " + nails.size());
        System.out.println("Coordinates of nails points:");
        for (Map.Entry<String, String> nail: nails.entrySet())
            System.out.println(nail.getValue() + ": " + nail.getKey());

        System.out.println("\nBoard of adverts: ");
        for (int i = 0; i < sizeBoardX; i++)
            System.out.println(Arrays.toString(board[i]));
    }


    public static void main(String[] args) {

        Main obj = null;
        try {
            obj = new Main();
            obj.initBoard();
            obj.addAdsOnBoard();
            obj.printData();
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        }
    }

}
