package task2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кирилл on 25.03.2017.
 */
public class Ad extends ScalableObject {
    public Ad(int width, int height) {
        this.height = height;
        this.width = width;
        x=y=0;
    }

    public Ad(int width, int height, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public static List<Ad> adListFactory(int quantity, int width, int height) {
        List<Ad> adList = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            adList.add(new Ad(width, height));
        }
        return adList;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
}
