package tech.romancha.interesting.elementary.second;

import java.util.Scanner;

/**
 * Write a program that asks the user for their name and greets them with their name.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
