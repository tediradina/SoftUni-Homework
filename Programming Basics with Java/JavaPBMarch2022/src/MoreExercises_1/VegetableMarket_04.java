package MoreExercises_1;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());

        double sumPriceBG = (priceVegetables * kgVegetables + priceFruit * kgFruit);
        double priceEuro = sumPriceBG / 1.94;

        System.out.printf("%.2f",priceEuro);

    }
}
