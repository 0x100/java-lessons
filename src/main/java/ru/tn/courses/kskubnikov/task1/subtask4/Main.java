package task1.subtask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Кирилл on 12.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List <String> checked = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        int maxFreq, curFreq, lastIndex;
        maxFreq = curFreq = lastIndex = 0;
        String curSubStr, maxSubStr = "";
        for (int low = 0; low < str.length() / 2; low++) {
            for (int high = 2; high <= str.length() - low; high++) {
                curSubStr = str.substring(low, low + high);
                if(!checked.contains(curSubStr)) {
                    checked.add(curSubStr);
                    while (lastIndex != -1) {
                        lastIndex = str.indexOf(curSubStr, lastIndex);
                        if (lastIndex != -1) {
                            curFreq++;
                            lastIndex += curSubStr.length();
                        }
                    }
                    if (curFreq > maxFreq || curFreq == maxFreq && curSubStr.length() > maxSubStr.length()) {
                        maxFreq = curFreq;
                        maxSubStr = curSubStr;
                    }
                }
                curFreq = 0;
                lastIndex = 0;
            }
        }
        if(maxFreq == 1){
            maxSubStr = str;
        }
        System.out.println(maxSubStr + " " + maxFreq);
    }
}
