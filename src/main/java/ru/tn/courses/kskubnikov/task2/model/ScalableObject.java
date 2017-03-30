package task2.model;

/**
 * Created by Кирилл on 25.03.2017.
 */
public abstract class ScalableObject extends OrientedObject {
    int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
