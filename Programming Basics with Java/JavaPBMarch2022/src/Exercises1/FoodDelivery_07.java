package Exercises1;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countChikenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegetarianMenu = Integer.parseInt(scanner.nextLine());

        double totalMenu = countChikenMenu * 10.35 + countFishMenu * 12.4 + countVegetarianMenu * 8.15;
        double desertPrice = totalMenu * 0.2;

        System.out.println(totalMenu + desertPrice + 2.5);

    }
}
