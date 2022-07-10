package Lab4;

import java.util.Scanner;

public class Probno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int currentNumber= 1;

        for (int i = 1; i <= numbers ; i++){
            for (int j = 1; j<= i; j++){

                System.out.printf("%d ",currentNumber);
                currentNumber++;
                if (currentNumber > numbers ){
                    break;
                }
            }
            if(currentNumber > numbers){
                break;
            }
            System.out.println();
            if (currentNumber > numbers ){
                break;
            }
        }
    }
}

