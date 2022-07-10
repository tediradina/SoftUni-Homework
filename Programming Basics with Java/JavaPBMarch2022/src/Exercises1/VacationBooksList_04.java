package Exercises1;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int countPagesFor1Hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int countHoursForBook = pages / countPagesFor1Hours;
        int hoursFor1Days = countHoursForBook / days;

      System.out.println(hoursFor1Days);
    }
}
