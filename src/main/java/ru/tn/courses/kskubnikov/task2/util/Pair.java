package task2.util;

/**
 * Created by Кирилл on 29.03.2017.
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair" +
                " first=" + first +
                ", second=" + second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
