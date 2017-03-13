package ru.tn.courses.mgrebnev.task1.v4.subtask4;

import java.util.ArrayList;

/**
 * Created by Max on 13.03.2017.
 */
public class Main {

    public static void main(String[] args){

        String sentence = "домкубдомкубкубкуб";

        ArrayList subStrings = new ArrayList();

        int lengthSubWord = 2;

        while(lengthSubWord <= sentence.length()){
            for ( int i = 0; i <= sentence.length()-lengthSubWord; i++){
                subStrings.add(sentence.substring(i,i+lengthSubWord));
            }
            lengthSubWord++;
        }

        System.out.println("Кол-во подстрок =  " + subStrings.size());

        int count = 0;
        int сountSubWord = 0;

        ArrayList subWord = new ArrayList();
        ArrayList counterSubWord = new ArrayList();

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

        int recommendedLength = 2;
        String subStringsWithRerecommendedLength = "";

        for(int i = 0; i < subWord.size(); i++){
            System.out.println("Подстрока  " + subWord.get(i) + "  встречается " + counterSubWord.get(i) + " раз" );

            if(subWord.get(i).toString().length() == recommendedLength){
                subStringsWithRerecommendedLength +=subWord.get(i) + "  встречаются " + counterSubWord.get(i) + " раз \n";
            }
        }

        System.out.println("\nПодстроки с длинной " + recommendedLength + ":\n \n" + subStringsWithRerecommendedLength);

    }
}
