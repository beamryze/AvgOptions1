/*
 *
 *  Description: Process input and calculate average
 *  Name: Rick
 *  Semester: Fall 2021
 *
 */

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intFirst, intSecond, intThird;
        int total;
        double avg;

        System.out.print("Fill First Number : ");
        intFirst = input.nextInt();

        System.out.print("Fill Second Number : ");
        intSecond = input.nextInt();

        System.out.print("Fill Third Number : ");
        intThird = input.nextInt();

        total = intFirst + intSecond + intThird;
        avg = total / 3;

        System.out.println("Average of the three numbers is : " + avg
        );


    }
}
