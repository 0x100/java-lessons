package ru.tn.courses.vlysykh.task1.v3.subtask4;

/**
 * Created by ElemenT87 on 14.03.2017.
 */
public class SuperString {
    public static final int START_PREFIX_SIZE = 2;
    private String superString;

    public SuperString(String superString) {
        this.superString = superString;
    }

    public void print(){
        System.out.println(superString);
    }

    public void searchMaxPrefix () {

        String prefix, subString;
        String maxPrefix = "";
        int count, position;
        int superStringLength = superString.length();
        int maxCount = 0;

        for (int stringPosition = 0; stringPosition < superStringLength; stringPosition++) {

            for (int prefixSize = START_PREFIX_SIZE; prefixSize <= superStringLength - stringPosition; prefixSize++) {
                prefix = superString.substring(stringPosition, stringPosition + prefixSize);
                count = position = 0;

                while (position < superStringLength) {
                    subString = superString.substring(position, superStringLength);
                    if (subString.startsWith(prefix)) {
                        count++;
                    }
                    position++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxPrefix = prefix;
                } else if(count == maxCount && prefix.length() > maxPrefix.length()){
                    maxCount = count;
                    maxPrefix = prefix;
                }
            }
        }
        print();
        System.out.println(maxPrefix + " " + maxCount);
    }
}
