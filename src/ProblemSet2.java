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
         System.out.println("\nNAME\t: " + firstName + " " + lastName);
         System.out.println("GRADE\t: " + grade);
         System.out.println("AGE\t: " + age);
         System.out.println("HOMETOWN: " + hometown);

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
         double leftOver;

         System.out.print("\nEnter dollar amount: ");
         leftOver = in.nextDouble();
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
         System.out.println("\nDOLLARS\t: " + dollars);
         System.out.println("QUARTERS: " + quarterAmount);
         System.out.println("DIMES\t: " + dimeAmount);
         System.out.println("NICKELS\t: " + nickelAmount);
         System.out.println("PENNIES\t: " + pennieAmount);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
         final double FIVE_BILL = 500;
         final double TEN_BILL = 1000;
         final double TWENTY_BILL = 2000;

         System.out.print("\nEnter dollar amount: ");
         leftOver = in.nextDouble();
         leftOver *= 100;
         int bills = (int)(leftOver/TWENTY_BILL);
         leftOver %= TWENTY_BILL;
         bills += (int)(leftOver / TEN_BILL);
         leftOver %= TEN_BILL;
         bills += (int)(leftOver / FIVE_BILL);
         leftOver %= FIVE_BILL;
         bills += (int)(leftOver / DOLLAR_VALUE);
         leftOver %= DOLLAR_VALUE;
         int coins =(int)(leftOver/QUARTER_VALUE);
         leftOver %= QUARTER_VALUE;
         coins +=(int)(leftOver/DIME_VALUE);
         leftOver %= DIME_VALUE;
         coins +=(int)(leftOver/NICKEL_VALUE);
         leftOver %= NICKEL_VALUE;
         coins +=(int) (leftOver/PENNIE_VALUE);
         System.out.println("\nBILLS\t: " + bills);
         System.out.println("COINS\t: " + coins);


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
         final double INCH_IN_MILE = 63360;
         final double INCH_IN_YARD = 36;
         final double INCH_IN_FOOT = 12;

         System.out.print("Enter a number on inches: ");
         double inchesRemaining = in.nextDouble();
         int miles = (int) (inchesRemaining / INCH_IN_MILE);
         inchesRemaining %= INCH_IN_MILE;
         int yards = (int) (inchesRemaining / INCH_IN_YARD);
         inchesRemaining %= INCH_IN_YARD;
         int feet = (int) (inchesRemaining / INCH_IN_FOOT);
         int finalInches = (int) (inchesRemaining % INCH_IN_FOOT);
         System.out.println("\nMILES\t: " + miles);
         System.out.println("YARDS\t: " + yards);
         System.out.println("FEET\t: " + feet);
         System.out.println("Inches\t: " + finalInches);



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
         final double CM_IN_KILO = 100000;
         final double CM_IN_METER = 100;

         System.out.print("Enter a number of centimeters: ");
         double cmRemaining = in.nextDouble();



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
