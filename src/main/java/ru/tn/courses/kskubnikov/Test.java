import task2.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Кирилл on 29.03.2017.
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        for (Iterator<Integer> iterator = l.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();

        }

    }

}
