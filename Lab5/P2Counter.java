/**
 * Programmer: Pawel Wodyk 
 * StudentID: B00122935 
 * Written on: 22/10/18 
 * Function:
 *      Takes input "score" ten times
 *      Calculate and output avarage
 */

import java.util.Scanner;

class P2Counter {
    public static void main(String[] args) {

        int numberOfStudents = 10, counter = 0, totalScore = 0;
        double avg = 0;

        Scanner input = new Scanner(System.in);

        /* 
        //This code alow for user to input the number of students 
        System.out.print("Please enter number of students: ");
        numberOfStudents = input.nextInt();
        System.out.println("\nYou have entered " + numberOfStudents + " students.\n*******************************");
        */

        while (counter < numberOfStudents) {
            System.out.print("Enter score of the student number: " + (counter + 1) + " :: ");
            totalScore += input.nextInt();
            counter++;
        }

        avg = (double) totalScore / numberOfStudents;

        System.out.println("the avarage score on the exam was " + avg);

        input.close();
    }
}