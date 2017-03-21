/**
 * Created by Павел on 12.03.2017.
 */
public class Main1
{
    public static void main(String args[])
    {
        int n = 10; // кол-во покупателей в очереди
        int tj = ((int) (Math.random() * 10)) + 1; //время обслуживания одного покупателя
        int Arr[] = new int[n];
        int temp = 0;

        System.out.print("ti = " + tj + "\n");
        for(int i = 0; i < n; i++)
        {
            temp += tj;
            Arr[i] = temp;
            System.out.print(i + 1 + "-й покупатель проведет в очереди " + Arr[i] + " единицы времени \n");
        }
    }
}
