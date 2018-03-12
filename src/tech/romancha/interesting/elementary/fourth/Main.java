package tech.romancha.interesting.elementary.fourth;

import java.util.Scanner;

/*
* Ask a number n and display the sum from 1 to n
 */

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum +=i;
        }
        System.out.println("Sum n = " + sum);
    }
}
