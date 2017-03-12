import java.util.ArrayList;
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


        int coincidence, bigCoincidence = 0, subStrLen = 2;
        String subStr = new String();
        String bigSubStr = new String();
        bigSubStr = subStr = str.substring(0, subStrLen);

        ArrayList<String > strs = new ArrayList<>();
        ArrayList<Integer> coin = new ArrayList<>();

        for (int k = 0; k < str.length() - 2; k++) {

            int j = 0;
            while (j != str.length() - subStr.length()) {

                coincidence = 0;
                for (int i = 0; i < str.length() - subStr.length() + 1; i++)
                    if (subStr.equals(str.substring(i, subStrLen + i)))
                        coincidence++;

                if (coincidence > bigCoincidence) {
                    bigCoincidence = coincidence;
                    bigSubStr = subStr;
                }
                j++;
                subStr = str.substring(j, subStrLen + j);
            }
            strs.add(bigSubStr);
            coin.add(bigCoincidence);
            subStrLen++;
            subStr = str.substring(0, subStrLen);
            bigSubStr = subStr;
            bigCoincidence = 0;
        }

        int j = 0;
        coincidence = coin.get(j);
        System.out.println();
        for (int i = 0; i < str.length() - 2; i++) {
            System.out.println(strs.get(i) + " - " + coin.get(i));
            if (coincidence < coin.get(i)) {
                coincidence = coin.get(i);
                j = i;
            }
        }
        subStr = strs.get(j);
        for (int i = 0; i < str.length() - 2; i++)
            if (coincidence == coin.get(i) && strs.get(j).length() < strs.get(i).length())
                j = i;

        System.out.println("\nMore coincidence: " + strs.get(j) + "\nAmount: " + coin.get(j));

    }
}
