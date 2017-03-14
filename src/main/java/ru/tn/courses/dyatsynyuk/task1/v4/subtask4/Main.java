package ru.tn.courses.dyatsynyuk.task1.v4.subtask4;

import java.util.*;

/**
 * Created by dasha on 13.03.2017.
 */
public class Main{
    private String word="abcdefghabcabcdeab";
    private Map<String,Integer> substringArray=new HashMap<>();
    private Integer maxFrequency=0;
    private String resultWord;

    private void createSubstring(){
     for(int i=0; i<word.length()-1; i++)
     {
         Character startCharacter=word.toCharArray()[i];
         String startWord=startCharacter.toString();
         for(int j=i+1; j<word.length(); j++)
         {
             Character newChar=word.toCharArray()[j];
             startWord+=newChar.toString();
             if(substringArray.containsKey(startWord))
             {
                 substringArray.put(startWord,substringArray.get(startWord)+1);
             }
             else
             {
                 substringArray.put(startWord,1);
             }
         }
         for (Map.Entry<String,Integer> item: substringArray.entrySet() ) {
             if(item.getValue().intValue() >maxFrequency.intValue())
             {
                 maxFrequency=item.getValue();
                 resultWord=item.getKey();
             }
             else if(item.getValue().equals(maxFrequency))
             {
                 if(item.getKey().length()>resultWord.length())
                 {
                     maxFrequency=item.getValue();
                     resultWord=item.getKey();
                 }
             }
         }
     }
    }


    private void printResult(){
        System.out.println(maxFrequency+" "+resultWord);
    }

    public Main(){
        createSubstring();
        printResult();
    }

    public static void main(String [ ] args)
    {
        Main arr=new Main();
    }
}
