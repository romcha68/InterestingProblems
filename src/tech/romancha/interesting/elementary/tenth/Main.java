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
        for(int leapYearCounter = 0; leapYearCounter < 20;) {
            ++year;
            if (gregorianCalendar.isLeapYear(year)) {
                leapYearCounter++;
                System.out.printf("%15d \n",year);
            }
        }
    }
}
