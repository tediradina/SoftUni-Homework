package Exercises2;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int countPuzle = Integer.parseInt(scanner.nextLine());
        int counSpeakDolls = Integer.parseInt(scanner.nextLine());
        int countTeddyBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countKamions = Integer.parseInt(scanner.nextLine());


        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина. Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        double sumMoneyPuzle = countPuzle * 2.6;
        double sumMoneyDolls = counSpeakDolls * 3.0;
        double sumMoneyTeddyBears = countTeddyBears * 4.1;
        double sumMoneyMinions = countMinions * 8.2;
        double sumMoneyKamion = countKamions * 2.0;

        int countToy =countPuzle + counSpeakDolls + countTeddyBears + countMinions + countKamions;
        double totalPrice = sumMoneyDolls + sumMoneyKamion + sumMoneyMinions +sumMoneyPuzle + sumMoneyTeddyBears;

        if (countToy >= 50){
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        double naem = totalPrice * 0.1;
        double winMoney = totalPrice - naem;

        double diff =Math.abs( winMoney - priceHoliday);

        if (winMoney >= priceHoliday){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }



        //На конзолата се отпечатва

        //· Ако парите са достатъчни се отпечатва
        //o "Yes! {оставащите пари} lv left."
        //· Ако парите НЕ са достатъчни се отпечатва:
        //o "Not enough money! {недостигащите пари} lv needed."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.
    }
}
