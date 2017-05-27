package main.java.ru.tn.courses.dmakoshenko.task2.v2.subtask1;

/**
 * Created by Danil on 14.05.2017.
 */
public class Advertisment {
    private boolean[] nails = new boolean[4];

    public boolean hasNail(boolean top, boolean left){
        if (top)
            return left?nails[0]:nails[1];
        return left?nails[2]:nails[3];
    }

    public void setNail(boolean top, boolean left){
        if (top)
            if (left) nails[0] = true;
            else nails[1] = true;
        else
            if (left) nails[2] = true;
            else nails[3] = true;
    }
    public int GetCountNails(){
        int count = 0;
        for (boolean nail: nails)
            if (nail) count++;
        return count;
    }

}
