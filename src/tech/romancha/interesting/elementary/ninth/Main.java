package tech.romancha.interesting.elementary.ninth;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a guessing game where the user has to guess a secret number. After every guess
 * the program tells the user whether their number was too large or too small. At the
 * end the number of tries needed should be printed. I counts only as one try if they
 * input the same number multiple times consecutively.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int i = 1;

        while (true) {
            System.out.println("Guess the number from 0 to 100");
            int inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber) {
                System.out.println("You guessed the number!");
                break;
            } else if (inputNumber > randomNumber) {
                System.out.println("Less!");
            } else if (inputNumber < randomNumber) {
                System.out.println("More!");
            }
            System.out.println("Attempt " + i++);
        }
        System.out.println("Just attempt to: " + i);
    }
}
