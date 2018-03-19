package tech.romancha.interesting.elementary.ninth;

import java.util.Random;
import java.util.Scanner;

/**
 * Guess the number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int i = 1;

        while (true){
            System.out.println("Guess the number from 0 to 100");
            int inputNumber = scanner.nextInt();
            if(inputNumber == randomNumber){
                System.out.println("You guessed the number!");
                break;
            }else if(inputNumber > randomNumber){
                System.out.println("Less!");
            }else if(inputNumber < randomNumber){
                System.out.println("More!");
            }
            System.out.println("Attempt " + i++);

        }
        System.out.println("Just attempt to: " + i);
    }
}
