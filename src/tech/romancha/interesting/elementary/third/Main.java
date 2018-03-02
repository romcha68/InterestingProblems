package tech.romancha.interesting.elementary.third;

import java.util.Scanner;

/**
 * Modify the previous program so that only users Alice and Bob were welcomed by name
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals("Alice")){
            System.out.println("Hello, " + name + "!");
        }
        else if(name.equals("Bob")){
            System.out.println("Hello, " + name + "!");
        }
        else return;
    }
}
