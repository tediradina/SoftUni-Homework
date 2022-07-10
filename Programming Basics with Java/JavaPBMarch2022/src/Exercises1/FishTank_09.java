package Exercises1;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double lice = lenght * wight * height;
        double litri = lice / 1000;

        double neededLitres = litri * (1-(percent/100));

        System.out.println(neededLitres);


    }
}
