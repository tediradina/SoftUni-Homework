package Exercises2;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int timeSerial = Integer.parseInt(scanner.nextLine());
        int freeTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = freeTime / 8.0;
        double relaxTime = freeTime / 4.0;

        double diffForMovie = freeTime - lunchTime - relaxTime;
        double diff = Math.abs(diffForMovie - timeSerial);

        if (diffForMovie >= timeSerial){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial,Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial,Math.ceil(diff) );
        }


    }
}
