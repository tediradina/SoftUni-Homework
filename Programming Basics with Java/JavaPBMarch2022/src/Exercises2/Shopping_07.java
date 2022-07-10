package Exercises2;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int procesorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCardsCount * 250;
        double procesorPrice = videoCardsPrice * 0.35 * procesorsCount;
        double ramPrice = videoCardsPrice * 0.1 * ramCount;

        double totalPrice = videoCardsPrice + procesorPrice + ramPrice;

        if (videoCardsCount > procesorsCount){
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }



        //Изход
        //На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
        //· Ако бюджета е достатъчен:
        //""
        //· Ако сумата надхвърля бюджета:
        //"
        //Резултатът да се форматира до втория знак след десетичната запетая.
    }
}
