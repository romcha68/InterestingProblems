package tech.romancha.interesting.elementary.eighth;

import java.util.Scanner;

/**
 * Created by User on 15.03.2018.
 */
public class Main {
    public static boolean isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {
            if ((n % i) == 0){
                return false;
        }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int n = scanner.nextInt();

        for(int j = 2; j <= n; j++){
            if(isPrimeNumber(j)){
                System.out.println(j);
            }
        }

    }
}
