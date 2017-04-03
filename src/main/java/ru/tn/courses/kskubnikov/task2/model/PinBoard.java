package task2.model;

import task2.exception.OutOfBoardException;
import task2.util.Pair;

import java.util.*;

/**
 * Created by Кирилл on 25.03.2017.
 */
public class PinBoard extends ScalableObject {
    private List<Ad> ads;
    private Set<Pin> pins;

    public PinBoard(int w, int h) {
        width = w;
        height = h;
        x = y = 0;
    }

    public PinBoard(int w, int h, List<Ad> ads, Set<Pin> pins) {
        width = w;
        height = h;
        this.ads = ads;
        this.pins = pins;
        x = y = 0;
    }

    public List<Ad> getAds() {
        return ads;
    }

    private Pair<Integer> createAdMap(Pair<Integer> hw, int qnty) {
        int rows = 0;
        int cols = 0;
        int avalRows = hw.getFirst();
        int avalCols = hw.getSecond();
        for (int i = 1; i <= avalRows; i++) {
            int tmpCols = (int) Math.ceil((qnty + .0) / (i + .0));
            if ((tmpCols <= avalCols && i > 1 && tmpCols > 1 && tmpCols > cols) || avalCols == 1) {
                rows = i;
                cols = (int) Math.ceil((qnty + .0) / (i + .0));
            }
        }
        System.out.println("ok");
        return new Pair<>(rows, cols);
    }

    private Pair<Integer> checkCapacity(int quantity, int adH, int adW) throws OutOfBoardException {
        int freeW = width;
        int cntW = 0;
        int cntH = 0;
        int freeH = height;
        //cntW = freeW /
        if (freeW >= adW) {
            freeW -= adW;
            cntW++;
            while (freeW >= adW - 3) {
                freeW -= adW - 3;
                cntW++;
            }
        }
        if (freeH >= adH) {
            freeH -= adH;
            cntH++;
            while (freeH >= adH - 3) {
                freeH -= adH - 3;
                cntH++;
            }
        }
        if (cntH * cntW >= quantity) {
            System.out.println("checked");
            return new Pair<>(cntH, cntW);
        } else {
            throw new OutOfBoardException();
        }
    }

    public void setAds(int quantity, int adH, int adW) throws OutOfBoardException {
        Pair adaptedSize = checkCapacity(quantity, adH, adW);
        Pair adMap = createAdMap(adaptedSize, quantity);
        System.out.println("Max size: " + adaptedSize);
        System.out.println("Adapted size: " + adMap);
        Set<Pin> pins = new HashSet<>();
        List<Ad> ads = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < (int) adMap.getFirst(); i++) {
            if (cnt == quantity) {
                break;
            }
            for (int j = 0; j < (int) adMap.getSecond(); j++) {
                int x = (adW - 3) * j;
                int y = (adH - 3) * i;
                if (i == 0) {
                    if (j == 0) {
                        pins.add(new Pin(x + 2, y + 2));
                        pins.add(new Pin(x + adW - 2, y + 2));
                        pins.add(new Pin(x + 2, y + adH - 2));
                        pins.add(new Pin(x + adW - 2, y + adH - 2));
                    } else {
                        pins.add(new Pin(x + adW - 2, y + adH - 2));
                        pins.add(new Pin(x + adW - 2, y + 2));
                    }
                } else {
                    if (j == 0) {
                        pins.add(new Pin(x + 2, y + adH - 2));
                        pins.add(new Pin(x + adW - 2, y + adH - 2));
                    } else {
                        pins.add(new Pin(x + adW - 2, y + adH - 2));
                    }
                }
                ads.add(new Ad(adW, adH, x, y));
                cnt++;
                if (cnt == quantity) {
                    break;
                }
            }
        }
        System.out.println("placed");
        this.ads = ads;
        this.pins = pins;

    }

    @Override
    public String toString() {
        String out = "Кол-во объявлений: " + ads.size() + "\nКоординаты объявлений: ";
        for (Iterator<Ad> iterator = ads.iterator(); iterator.hasNext(); ) {
            Ad tmp = iterator.next();
            out+='\n' + tmp.toString();

        }
        out += "\nКол-во гвоздей: " + pins.size() + "\nКоординаты гвоздей: ";
        for (Iterator<Pin> iterator = pins.iterator(); iterator.hasNext(); ) {
            Pin tmp = iterator.next();
            out+='\n' + tmp.toString();
        }

        return out;
    }

    public Set<Pin> getPins() {
        return pins;
    }

    public void setPins(Set<Pin> pins) {
        this.pins = pins;
    }
}
