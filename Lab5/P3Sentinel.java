/**
 * Programmer: Pawel Wodyk 
 * StudentID: B00122935 
 * Written on: 22/10/18 
 * Function:
 *      Take input from user
 *      iterates until user enters -1
 *      calculate and output the avarage score
 */


import java.util.Scanner;

class P3Sentinel {
    public static void main(String[] args) {
        int totalScore = 0, numberOfStudents = 0, score = 0;
        double avg = 0;

        Scanner input = new Scanner(System.in);

        while (score != -1) {
            System.out.print("Enter the student score: ");
            score = input.nextInt();
            if (score == -1) {
                System.out.println("You've entered -1");
                avg = (double) totalScore / numberOfStudents;
                if (numberOfStudents != 0){
                    System.out.println("the avarage score on the exam was " + avg);
                }
            }else if(score >= 0 && score <= 100){
                totalScore += score;
                numberOfStudents++;
                
            } else {
                System.out.println("You have enter incorect data please enter the numer between 0 - 100");
            }
        }

        input.close();
    }
}