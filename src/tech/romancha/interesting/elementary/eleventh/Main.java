package tech.romancha.interesting.elementary.eleventh;

/**
 * The solution formula
 */
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int k = 1; k <= Math.pow(10, 6); k++) {
            sum += Math.pow((-1), (k + 1)) / (2 * k - 1);
        }
        System.out.println("The end result is equal to \n\t"   + 4 * sum);
    }
}
