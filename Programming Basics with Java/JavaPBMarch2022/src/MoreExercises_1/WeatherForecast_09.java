package MoreExercises_1;

import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if (weather.equals("sunny")){
            System.out.println("It's warm outside!");
        }else {
            System.out.println("It's cold outside!");
        }

        //Напишете програма, която познава дали е топло или студено навън. От конзолата се чете един ред – текст, който подсказва какво е времето.
        // При въвеждане на "sunny" трябва да се отпечата .
        // Във всички останали случаи трябва да се отпечата "".
    }
}
