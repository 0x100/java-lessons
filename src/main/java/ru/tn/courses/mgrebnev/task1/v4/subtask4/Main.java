package ru.tn.courses.mgrebnev.task1.v4.subtask4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 22.03.2017.
 */
public class Main {

    public static void main(String[] args){

        String sentence = "домкубдомкубкуб";

        List<String> subStrings = new ArrayList();

        int lengthSubWord = 1;

        while(lengthSubWord <= sentence.length()){
            for ( int i = 0; i <= sentence.length()-lengthSubWord; i++){
                subStrings.add(sentence.substring(i,i+lengthSubWord));
            }
            lengthSubWord++;
        }

        int count = 0;
        int сountSubWord = 0;

        List<String> subWord = new ArrayList();
        List<Integer> counterSubWord = new ArrayList();

        for ( int i = 0; i < subStrings.size(); i++){
            for (int j = 0; j < subStrings.size(); j++){

                if (subStrings.get(i).equals(subStrings.get(j))){
                    count++;
                }

            }

            if ( count >= сountSubWord){
                сountSubWord = count;

                if(!subWord.contains(subStrings.get(i).toString())){
                    subWord.add(subStrings.get(i).toString());
                    counterSubWord.add(count);
                }

            }
            count = 0;
        }

        String resultSubString = subWord.get(0);
        int Freq = counterSubWord.get(0);
        int maxElemWithLargeLength = subWord.get(0).length();

        for(int i = 0; i < subWord.size(); i++){
            if ( subWord.get(i).length() >= maxElemWithLargeLength ){
                maxElemWithLargeLength = subWord.get(i).length();
                resultSubString = subWord.get(i);
                Freq = counterSubWord.get(i);
            }
        }

        System.out.println( resultSubString + ", " + Freq );
    }
}
