/**
 * Created by MAG on 12.03.2017.
 */
public class Main {

    public static void  main(String args[]){

        int N = 5; // число банков в городе

        double course[] = new double[N]; // курс доллара к рублю в каждом банке

        //  диапазон колебания курса в разных банках (50 < cours[i] < 60)
        int min = 50;
        int k = 10;

        // генерирование курса для каждого банка
        for(int i = 0; i < course.length; i++){
            course[i] =  min + Math.random() * k;
        }

        // поиск наиболее выгодного курса
        double max = 0;
        int num = 0;
        for(int i = 0; i < course.length; i++){
            if(course[i] > max ){
                max = course[i];
                num = i;
            }
        }

        System.out.print("The best course in the " + num + " bank = " + course[num] + " rubles");
    }

}

