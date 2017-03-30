package task2.model;

/**
 * Created by Кирилл on 25.03.2017.
 */
public class Pin extends OrientedObject {
    public Pin(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
}
