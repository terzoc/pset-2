/*
 * Problem Set 2.
 * Copyright (c) 2019. UCVTS and its affiliated.
 *
 * Use is allowed as long as credit is given.
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
         // System.out.print("\nEnter you first name: ");
         // String firstName = in.nextLine();
         // System.out.print("Enter you last name: ");
         // String lastName = in.nextLine();
         // System.out.print("Enter you grade: ");
         // byte grade = in.nextByte();
         // System.out.print("Enter you age: ");
         // byte age = in.nextByte();
         // in.nextLine();
         // System.out.print("Enter you hometown: ");
         // String hometown = in.nextLine();
         // System.out.println("\nNAME\t: " + firstName + " " + lastName);
         // System.out.println("GRADE\t: " + grade);
         // System.out.println("AGE\t: " + age);
         // System.out.println("HOMETOWN: " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
         // final double DOLLAR_VALUE = 100;
         // final double QUARTER_VALUE = 25;
         // final double DIME_VALUE = 10;
         // final double NICKEL_VALUE = 5;
         // final double PENNIE_VALUE = 1;
         // double leftOver;
         //
         // System.out.print("\nEnter dollar amount: ");
         // leftOver = in.nextDouble();
         // leftOver *= 100;
         // int dollars =(int)(leftOver/DOLLAR_VALUE);
         // leftOver = leftOver % DOLLAR_VALUE;
         // int quarterAmount =(int)(leftOver/QUARTER_VALUE);
         // leftOver = leftOver % QUARTER_VALUE;
         // int dimeAmount =(int)(leftOver/DIME_VALUE);
         // leftOver = leftOver % DIME_VALUE;
         // int nickelAmount =(int)(leftOver/NICKEL_VALUE);
         // leftOver = leftOver % NICKEL_VALUE;
         // int pennieAmount =(int) (leftOver/PENNIE_VALUE);
         // System.out.println("\nDOLLARS\t: " + dollars);
         // System.out.println("QUARTERS: " + quarterAmount);
         // System.out.println("DIMES\t: " + dimeAmount);
         // System.out.println("NICKELS\t: " + nickelAmount);
         // System.out.println("PENNIES\t: " + pennieAmount);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
         // final double FIVE_BILL = 500;
         // final double TEN_BILL = 1000;
         // final double TWENTY_BILL = 2000;
         //
         // System.out.print("\nEnter dollar amount: ");
         // leftOver = in.nextDouble();
         // leftOver *= 100;
         // int bills = (int)(leftOver/TWENTY_BILL);
         // leftOver %= TWENTY_BILL;
         // bills += (int)(leftOver / TEN_BILL);
         // leftOver %= TEN_BILL;
         // bills += (int)(leftOver / FIVE_BILL);
         // leftOver %= FIVE_BILL;
         // bills += (int)(leftOver / DOLLAR_VALUE);
         // leftOver %= DOLLAR_VALUE;
         // int coins =(int)(leftOver/QUARTER_VALUE);
         // leftOver %= QUARTER_VALUE;
         // coins +=(int)(leftOver/DIME_VALUE);
         // leftOver %= DIME_VALUE;
         // coins +=(int)(leftOver/NICKEL_VALUE);
         // leftOver %= NICKEL_VALUE;
         // coins +=(int) (leftOver/PENNIE_VALUE);
         // System.out.println("\nBILLS\t: " + bills);
         // System.out.println("COINS\t: " + coins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
         // final double INCH_IN_MILE = 63360;
         // final double INCH_IN_YARD = 36;
         // final double INCH_IN_FOOT = 12;
         //
         // System.out.print("\nEnter a number on inches: ");
         // double inchesRemaining = in.nextDouble();
         // int miles = (int) (inchesRemaining / INCH_IN_MILE);
         // inchesRemaining %= INCH_IN_MILE;
         // int yards = (int) (inchesRemaining / INCH_IN_YARD);
         // inchesRemaining %= INCH_IN_YARD;
         // int feet = (int) (inchesRemaining / INCH_IN_FOOT);
         // int finalInches = (int) (inchesRemaining % INCH_IN_FOOT);
         // System.out.println("\nMILES\t: " + miles);
         // System.out.println("YARDS\t: " + yards);
         // System.out.println("FEET\t: " + feet);
         // System.out.println("Inches\t: " + finalInches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
         // final double CM_IN_KILO = 100000;
         // final double CM_IN_METER = 100;
         //
         // System.out.print("\nEnter a number of centimeters: ");
         // double cmRemaining = in.nextDouble();
         //
         // int kilometers = (int) (cmRemaining / CM_IN_KILO);
         // cmRemaining %= CM_IN_KILO;
         // int meters = (int) (cmRemaining / CM_IN_METER);
         // int centimeters = (int) (cmRemaining % CM_IN_METER);
         //
         // System.out.println("\nKILOMETERS\t: " + kilometers);
         // System.out.println("METERS\t\t: " + meters);
         // System.out.println("CENTIMETERS\t: " + centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
         // System.out.print("\nEnter a diameter: ");
         // double diameter = in.nextDouble();
         // double area = Math.PI * diameter * diameter * (.25) ;
         // double circumfrence = Math.PI * diameter;
         // System.out.printf("\nAREA\t\t: %.2f", area);
         // System.out.printf("\nCIRCUMFRENCE\t: %.2f\n", circumfrence);



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
         // System.out.print("\nEnter a length: ");
         // double length = in.nextDouble();
         // System.out.print("Enter a width: ");
         // double width = in.nextDouble();
         // double areaRec = length * width;
         // double perimeter = length * 2 + width * 2 ;
         // double diagonal = Math.sqrt(length*length + width * width);
         // System.out.printf("\nAREA\t\t: %.2f", areaRec);
         // System.out.printf("\nPERIMETER\t: %.2f", perimeter);
         // System.out.printf("\nDIAGONAL\t: %.2f\n", diagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
         System.out.print("\nEnter a side length: ");
         double sideLength = in.nextDouble();
         double areaHex = ((3*Math.sqrt(3))/2) * sideLength * sideLength;
         double perimeterHex = sideLength * 6;
         System.out.printf("\nAREA\t\t: %.2f", areaHex);
         System.out.printf("\nPERIMETER\t: %.2f\n", perimeterHex);





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
