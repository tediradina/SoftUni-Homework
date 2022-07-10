package MoreExercises_1;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        if (degree >= 26 && degree <= 35){
            System.out.println("Hot");
        }else if(degree >= 20.1 && degree <=25.9){
            System.out.println("Warm");
        }else if(degree >= 15 && degree <= 20){
            System.out.println("Mild");
        }else if(degree >= 12 && degree <= 14.9){
            System.out.println("Cool");
        }else if (degree >= 5 && degree <= 11.9){
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }
        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold
    }
}
