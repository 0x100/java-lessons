package ru.tn.courses.mryabykh.task2.v1.subtask1.models;

import ru.tn.courses.mryabykh.task2.v1.subtask1.exceptions.AdIsExistsException;
import ru.tn.courses.mryabykh.task2.v1.subtask1.exceptions.AdOutOfBoardException;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Board {

    private int width;
    private int height;
    private List<Ad> ads;
    private List<Nail> nails;
    private int x;
    private int y;
    private int previousY;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.ads = new ArrayList<>();
        this.nails = new ArrayList<>();
        this.x = this.y = 0;
    }

    /**
     * Добавляет список объявлений на доску
     *
     * @param ads - набор объявлений, которые необходимо добавить на доску
     * @throws AdIsExistsException   - если такое объявление уже добавлено на доску
     * @throws AdOutOfBoardException - если произошел выход за границы доски
     */
    public void attachAd(List<Ad> ads) throws AdIsExistsException, AdOutOfBoardException {
        for (Ad ad : ads) {
            attachAd(ad);
        }
    }

    /**
     * Добавляет единичное объявление на доску.
     *
     * @param ad - объявление, которое необходимо добавить на доску
     * @throws AdIsExistsException   - если такое объявление уже добавлено на доску
     * @throws AdOutOfBoardException - если произошел выход за границы доски
     */
    public void attachAd(Ad ad) throws AdIsExistsException, AdOutOfBoardException {

        if (ads.contains(ad)) {
            throw new AdIsExistsException();
        }

        if ((y + ad.getHeight()) > height) {
            throw new AdOutOfBoardException();
        }

        addAd(ad);
        addNails(ad);

        if (y + ad.getHeight() >= height) {
            x += ad.getWidth() - 3;
        } else {
            switch (ads.size() % 4) { // dirty hack
                case 1:
                    previousY = y;
                    y += ad.getHeight() - 3;
                    break;
                case 2:
                    y = previousY;
                    x += ad.getWidth() - 3;
                    break;
                case 3:
                    previousY = y;
                    y += ad.getHeight() - 3;
                    break;
                case 0:
                    y = y - ad.getHeight() + 3;
                    x += ad.getWidth() - 3;
                    break;
            }
        }

        if (x + ad.getWidth() > width) {
            x = 0;
            y += 2 * (ads.get(ads.size() - 1).getHeight() - 3);
        }
    }

    private void addAd(Ad ad) {
        ad.setCoordinates(calcCoordinates(ad));
        ads.add(ad);
    }

    /**
     * Добавляет необходимое количество гвоздей для закрепления одного объявления на доске
     *
     * @param ad - объявление для закрепления
     */
    private void addNails(Ad ad) {
        int count = 0;
        // подсчитываем количество уже установленных гвоздей в пределах вставленного объявления
        for (Nail nail : nails) {
            if (nail.getX() > x && nail.getX() < x + ad.getWidth() && nail.getY() > y && nail.getY() < y + ad.getHeight()) {
                count++;
            }
        }
        switch (count) {
            case 0:
                addNail(x + 2, y + 2);
                addNail(x + (ad.getWidth() - 2), y + 2);
                addNail(x + 2, y + (ad.getHeight() - 2));
                addNail(x + (ad.getWidth() - 2), y + (ad.getHeight() - 2));
                break;
            case 1:
                break;
            case 2:
                if (x == 0) {
                    addNail(x + 2, y + (ad.getHeight() - 2));
                    addNail(x + (ad.getWidth() - 2), y + (ad.getHeight() - 2));
                } else {
                    addNail(x + (ad.getWidth() - 2), y + 2);
                    addNail(x + (ad.getWidth() - 2), y + (ad.getHeight() - 2));
                }
                break;
            case 3:
                addNail(x + (ad.getWidth() - 2), y + (ad.getHeight() - 2));
                break;
            case 4:
                break;
        }
    }

    private void addNail(int x, int y) {
        if (!nails.contains(new Nail(x, y))) {
            nails.add(new Nail(x, y));
        }
    }

    /**
     * Устанавливает координаты объявления в требуемом формате:
     * left - расстояние от левой границы доски до левой границы объявления
     * top - расстояние от верхней границы доски до верхней границы объявления
     * right - расстояние от правой границы доски до правой границы объявления
     * bottom - расстояние от нижней границы доски до нижней границы объявления
     *
     * @param ad - объявление
     * @return - координаты объявления в требуемом формате
     */
    private Coordinates calcCoordinates(Ad ad) {
        return new Coordinates(x, y, width - ((x + ad.getWidth())),
                height - ((y + ad.getHeight())));
    }

    public List<Ad> getAds() {
        return ads;
    }

    public List<Nail> getNails() {
        return nails;
    }


    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("Кол-во объявлений: ");
        toString.append(ads.size());
        toString.append("\nКоординаты объявлений: ");

        for (Ad tmp : ads) {
            toString.append('\n');
            toString.append(Arrays.toString(tmp.getCoordinates().getAdCoordinates()));
        }
        toString.append("\nКол-во гвоздей: ");
        toString.append(nails.size());
        toString.append("\nКоординаты гвоздей: ");
        for (Nail tmp : nails) {
            toString.append('\n');
            toString.append(Arrays.toString(tmp.getCoordinates().getNailCoordinates()));
        }

        return toString.toString();
    }
}
