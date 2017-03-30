package task2.exception;

/**
 * Created by Кирилл on 25.03.2017.
 */
public class OutOfBoardException extends Exception {
    public OutOfBoardException(){
        System.out.println("Cannot add ads to board. Check size");
    }
}
