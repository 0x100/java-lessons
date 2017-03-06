package main.java.ru.tn.courses.dmakoshenko.task1.v2.subtask2;

/**
 * Created by Danil on 02.03.2017.
 */
public class subtask2 {
    public static void main(String[] args){
        bankClass[] banks = new bankClass[5];
        banks[0] = new bankClass("neSberbank", 33);
        banks[1] = new bankClass("neAlfaBank", 33.5);
        banks[2] = new bankClass("neRayfayzen", 33.1);
        banks[3] = new bankClass("neVTB", 33.2);
        banks[4] = new bankClass("nePochtaBank", 33.3);

        bankClass bestBank;
        bestBank = banks[0];
        for(int i = 1; i < banks.length; i++){
            if (banks[i] != null && banks[i].curUsdToRub > bestBank.curUsdToRub)
                bestBank = banks[i];
        }
        System.out.println("best bank: " + bestBank.name);
    }
}
