package tech.romancha.interesting.elementary.tenth;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Print the next 20 leap years
 */
public class Main {
    public static void main(String[] args) throws Exception {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(Calendar.YEAR);
        System.out.println("Leap years: " );
        for(int i = 1; i < 100; i++) {
            ++year;
            if (gregorianCalendar.isLeapYear(year) == true) {
                i++;
                System.out.printf("%15d \n",year);
            }
        }
    }
}
