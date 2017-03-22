package ru.tn.courses.dyatsynyuk.task1.v4.subtask4;

import java.util.*;

/**
 * Created by dasha on 13.03.2017.
 */
public class Main{
    private String word="abaabaabaaba";
    private Integer maxFrequency=0;
    private String resultWord="";

    private void checkSubstring() {
        for (int i = 0; i < word.length()-1; i++) {
            for (int j = i+1; j < word.length(); j++) {
                String currentWord=word.substring(i,j);
                if(currentWord.length()>1) {
                    int index = word.indexOf(currentWord,j);
                    int currentFrequency = 1;
                    while (index != -1) {
                        currentFrequency++;
                        index=word.indexOf(currentWord,index+1);
                    }
                    if (maxFrequency < currentFrequency) {
                        maxFrequency = currentFrequency;
                        resultWord = currentWord;
                    } else if (maxFrequency == currentFrequency) {
                        if (resultWord.length() < currentWord.length()) {
                            resultWord = currentWord;
                        }
                    }
                }
            }
        }
    }

    private void printResult(){
        System.out.println(maxFrequency+" "+resultWord);
    }

    public Main(){
        checkSubstring();
        printResult();
    }

    public static void main(String [ ] args)
    {
        Main arr=new Main();
    }
}
