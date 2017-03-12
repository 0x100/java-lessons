/**
 * Created by Max on 12.03.2017.
 */

import java.util.*;

public class Main {

    public static void main(String[] args){

        String sentence = "домкубдомкубкуб";

        ArrayList substring = new ArrayList();

        int len_wrd = 2;
        String sub = "";

        while(len_wrd <= sentence.length()){
            for ( int i = 0; i <= sentence.length()-len_wrd; i++){

                for ( int k = 0; k < len_wrd; k++){
                    sub += sentence.charAt(i+k);
                }
                substring.add(sub);
                sub = "";
            }
            len_wrd++;
        }

        System.out.println("Count substings =  " + substring.size());

        int count = 0;
        int temp = 0;
        String result = "";

        for ( int i = 0; i < substring.size(); i++){
            for (int j = 0; j < substring.size(); j++){
                if (substring.get(i).equals(substring.get(j))){
                    count++;
                }
            }
            if ( count >= temp ){
                temp = count;
                result = substring.get(i).toString();
            }
            count = 0;
        }

        System.out.println("\n" + "word = " + result + " count = " + temp);
    }
}
