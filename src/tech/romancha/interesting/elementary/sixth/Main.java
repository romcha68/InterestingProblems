package tech.romancha.interesting.elementary.sixth;

import java.util.Scanner;

/**
 * Sum or product of numbers from 1 to n.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();
        int result;
        System.out.println("Select sum or mult: ");
        Scanner scanner1 = new Scanner(System.in);
        String enter = scanner1.nextLine();
        if (enter.equals("sum")) {
            result = 0;
            for (int i = 0; i <= n; i++) {
                result += i;
            }
            System.out.println("Sum = " + result);
        } else if (enter.equals("mult")) {
            result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Multiply = " + result);
        } else {
            System.out.println("Error when entering");
        }
    }

}

