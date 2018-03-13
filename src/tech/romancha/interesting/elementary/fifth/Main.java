package tech.romancha.interesting.elementary.fifth;

import java.util.Scanner;

/**
 * Sum the numbers in multiples of 3, 5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i%3==0 | i%5==0){
                    sum +=i;
            }
        }
        System.out.println("Sum n = " + sum);
    }
    }

