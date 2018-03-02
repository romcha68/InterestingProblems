package tech.romancha.interesting.elementary.second;

import java.util.Scanner;

/**
 * Created by User on 02.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
