package Exercises2;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
        // Да се напише програма, която чете времената на състезателите в секунди, въведени от потребителя и пресмята сумарното
        // им време във формат "минути:секунди".
        // Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int sumTime =  firstTime + secondTime + thirdTime;

        int minutes = sumTime / 60;
        int second = sumTime % 60;

        if(second < 10) {
            System.out.printf("%d:0%d", minutes, second);
        }else {
            System.out.printf("%d:%d", minutes, second);
        }
    }
}
