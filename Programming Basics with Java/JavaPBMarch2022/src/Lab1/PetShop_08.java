package Lab1;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDogsPackage = Integer.parseInt(scanner.nextLine());
        int countCatsPackage = Integer.parseInt(scanner.nextLine());

        //Цена на пакетите за храна като тези за куче са на стойност 2,5 лв. единият пакет, а този за котките струва 4 лв.
        System.out.println(countDogsPackage * 2.50 + countCatsPackage * 4 + " lv.");

    }
}
