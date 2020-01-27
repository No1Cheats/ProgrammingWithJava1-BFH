package UserInputValidation;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeInDays {

    /*
     * This exercise computes your age in days.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In which year were you born? (e.g., 1950)");
        int yearOfBirth = scanner.nextInt();



        System.out.println("In which month were you born? (e.g., 2 for February)");
        int monthOfBirth = scanner.nextInt();

        System.out.println("On which day of the month were you born? (1-31)");
        int dayOfBirth = scanner.nextInt();

        try {
            LocalDate birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
            LocalDate now = LocalDate.now();
            long days = birthDay.until(now, ChronoUnit.DAYS);
            System.out.println("You were born on " + birthDay + ".");
            System.out.println("Today is " + now + ".");
            System.out.println("You are " + days + " days old.");
            scanner.close();
        } catch (DateTimeParseException e){
            scanner.close();
        }





    }
}
