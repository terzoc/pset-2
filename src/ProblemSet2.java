/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
         System.out.print("\nEnter you first name: ");
         String firstName = in.nextLine();
         // in.nextLine();
         System.out.print("Enter you last name: ");
         String lastName = in.nextLine();
         System.out.print("Enter you grade: ");
         byte grade = in.nextByte();
         System.out.print("Enter you age: ");
         byte age = in.nextByte();
         in.nextLine();
         System.out.print("Enter you hometown: ");
         String hometown = in.nextLine();
         System.out.println("\nName\t: " + firstName + " " + lastName);
         System.out.println("Grade\t: " + grade);
         System.out.println("Age\t: " + age);
         System.out.println("Hometown: " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
         final double DOLLAR_VALUE = 100;
         final double QUARTER_VALUE = 25;
         final double DIME_VALUE = 10;
         final double NICKEL_VALUE = 5;
         final double PENNIE_VALUE = 1;

         System.out.print("\nEnter dollar amount: ");
         double leftOver = in.nextDouble();
         leftOver *= 100;
         int dollars =(int)(leftOver/DOLLAR_VALUE);
         leftOver = leftOver % DOLLAR_VALUE;
         int quarterAmount =(int)(leftOver/QUARTER_VALUE);
         leftOver = leftOver % QUARTER_VALUE;
         int dimeAmount =(int)(leftOver/DIME_VALUE);
         leftOver = leftOver % DIME_VALUE;
         int nickelAmount =(int)(leftOver/NICKEL_VALUE);
         leftOver = leftOver % NICKEL_VALUE;
         int pennieAmount =(int) (leftOver/PENNIE_VALUE);
         System.out.println("\nDollars\t: " + dollars);
         System.out.println("Quarters: " + quarterAmount);
         System.out.println("Dimes\t: " + dimeAmount);
         System.out.println("Nickels\t: " + nickelAmount);
         System.out.println("Pennies\t: " + pennieAmount);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */



        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
