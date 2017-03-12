import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Коба on 12.03.2017.
 *
 * На вход подаётся строка, необходимо определить подстроку с наибольшей длиной,
 * которая встречается в исходной строке наибольшее количество раз.
 * Результат: вывод этой подстроки и количество вхождений.
 */
public class Main {

    public static void main(String[] args) {

        int minLen = 3;
        Scanner input = new Scanner(System.in);
        String str = new String();

        do {
            System.out.print("Enter string (min length is " + minLen + "): ");
            str = input.nextLine();
        } while (str.length() < minLen);
        System.out.println("Your string: " + str);

        String subStr = new String();
        String bigSubStr = new String();
        HashMap<String, Integer> strings = new HashMap<>();

        int maxCoin = 0;
        for (int subStrLen = 2; subStrLen < str.length(); subStrLen++) {

            int coincidence, bigCoincidence = 0;
            bigSubStr = subStr = str.substring(0, subStrLen);

            for (int j = 0; j < str.length() - subStr.length(); j++ ) {

                coincidence = 0;
                for (int i = 0; i < str.length() - subStr.length() + 1; i++)
                    if (subStr.equals(str.substring(i, subStrLen + i)))
                        coincidence++;

                if (coincidence > bigCoincidence) {
                    bigCoincidence = coincidence;
                    bigSubStr = subStr;
                }
                subStr = str.substring(j, subStrLen + j);
            }
            maxCoin = bigCoincidence;
            strings.put(bigSubStr, bigCoincidence);
        }

        System.out.println("\nMax length");
        for (Map.Entry<String, Integer> string: strings.entrySet()) {
            System.out.println("    from " + string.getKey().length() + ": " + string.getKey() + " - " + string.getValue());
            if (maxCoin < string.getValue()) {
                maxCoin = string.getValue();
                subStr = string.getKey();
            }
        }

        for (Map.Entry<String, Integer> string: strings.entrySet())
            if (maxCoin == string.getValue() && subStr.length() < string.getKey().length())
                subStr = string.getKey();

        System.out.println("\nMore coincidence: " + subStr + "\nAmount: " + strings.get(subStr));

    }
}
