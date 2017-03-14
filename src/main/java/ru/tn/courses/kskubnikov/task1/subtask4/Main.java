package task1.subtask4;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * Created by Кирилл on 12.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        int maxFreq, curFreq, lastIndex;
        maxFreq = curFreq = lastIndex = 0;
        String curSubStr, maxSubStr = "";
        for (int low = 0; low < str.length(); low++) {
            for (int high = 2; high <= str.length() - low; high++) {
                curSubStr = str.substring(low, low + high);
                while (lastIndex != -1) {
                    lastIndex = str.indexOf(curSubStr, lastIndex);
                    if (lastIndex != -1) {
                        curFreq++;
                        lastIndex += curSubStr.length();
                    }
                }
                if (curFreq > maxFreq) {
                    maxFreq = curFreq;
                    maxSubStr = curSubStr;
                } else if(curFreq == maxFreq && curSubStr.length() > maxSubStr.length()){
                    maxFreq = curFreq;
                    maxSubStr = curSubStr;
                }
                curFreq = 0;
                lastIndex = 0;
            }
        }
        System.out.println(maxSubStr + " " + maxFreq);
    }
}
