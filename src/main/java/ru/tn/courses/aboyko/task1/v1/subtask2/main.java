import java.util.Scanner;

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введите количество людей в очереди");
        int peopleAmmount = in.nextInt();
        int [] serviceTime = new int [peopleAmmount];

        System.out.println("Укажите время ожидания для каждого клиента");
        for (int i = 0; i < peopleAmmount; i++){
            serviceTime[i] = in.nextInt();
        }

        System.out.println("Введите номер клиента в очереди");
        int clientNumber = in.nextInt();
        int waitingTime = 0;
        for (int i = 0; i < clientNumber; i++){
            waitingTime += serviceTime[i];
        }
        System.out.print("Время ожидания для клиента под номером " + clientNumber + " = " + waitingTime );

    }
