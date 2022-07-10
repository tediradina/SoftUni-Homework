package Lab3;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cena = 0;

        //Monday	Tuesday	Wednesday	Thursday	Friday	Saturday	Sunday
        //12	         12	     14	        14	      12	    16	      16

        String day = scanner.nextLine();

        switch (day){
            case "Monday":
                cena += 12;
                break;

            case "Tuesday":
                cena += 12;
                break;

            case "Wednesday":
                cena += 14;
                break;

            case "Thursday":
                cena += 14;
                break;

            case "Friday":
                cena += 12;
                break;

            case "Saturday":
                cena += 16;
                break;

            case "Sunday":
                cena += 16;
                break;
        }
        System.out.println(cena);

    }
}
