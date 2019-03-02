/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 * 		take the user input for temperature for each day of the week
 *      display values only if the temperature was over 18
 */

import java.util.Scanner;

public class L9TemperatureReadings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temperature[] = new double[7];
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("max temperature for " + dayName(i+1) + ": ");
            temperature[i] = sc.nextDouble();
        }
        System.out.println("###Temperatures and days with temp over 18###");
        for (int i = 0; i < temperature.length; i++){
            if (temperature[i] > 18) {
                System.out.println(dayName(i + 1) + ": " + temperature[i]);
            }
        }
    }

    public static String dayName(int dayNum){
        String day = "";
        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednsday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
        }
        return day;
    }

}