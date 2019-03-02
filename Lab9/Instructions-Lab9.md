# Lecture 4 Lab Exercises

## Program 1

Write an **application** that asks the user to enter 5 numbers, these numbers are stored in an array called **numbers**. The numbers are then printed to the screen.

***Save this program on your OneDrive within the Java/Week9 folder as `L9numbersarray.java`.***

## Program 2

Write an **applet** that initialises an array called grades with 10 values. Using the paint method, display the grade values from the array on the screen.

***Save this program on your OneDrive within the Java/Week9 folder as `L9GradesArray.java`.***

## Program 3

Return to program TemperatureReadings from lecture as shown below:

```java
// program to read temperatures from user and print out again
class TemperatureReadings
{
    public static void main(String[] args)
    {
        //declare and create array temperature
        double temperature[] = new double[7];

        //code to enter temperatures
        for (int i = 0; i < temperature.length; i++)
        {
            System.out.println("max temperature for day " + (i+1));
            temperature[i] = EasyIn.getDouble();
        }

        //code to display temperatures
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        for (int i = 0; i < temperature.length; i++)
        {
            System.out.println("day "+ (i+1) + " " + temperature[i]);
        }

        EasyIn.pause("press <ENTER> to Quit");
    }
}
```

Modify this program so that only temperatures > 18 are printed to the screen.

***Save this program on your OneDrive within the Java/Week9 folder as `L9TemperatureReadings.java`.***

## Program 4

Using the data list given below to initialise an array, write an **applet** to solve each of the following problems:

```
    Data List = 2,4,6,9,5,4,5,7,12,15,21,32,45,5,6,7,12
```

* Compute the sum of the elements in the array.
* Compute the product of the elements in the array.
* Print only the multiples of 3 in the array.
* Compute the frequency of the number 5 in the array.

***Save this program on your OneDrive within the Java/Week9 folder as `L9ArraySum.java`.***

## Program 5

Write a program that reads a list of 15 numbers and prints only those values that are greater than the last number on the list.

***Save this program on your OneDrive within the Java/Week9 folder as `L9GreatCheck.java`.***

## Written Questions

Consider the following explicit creation of an array:

```java
    int someArray = {2, 5, 1, 9, 11};
```

1. What would be the value of someArray.length?

2. What is the value of `someArray[2]`?

3. Create the equivalent array by assigning the **new** operator and then assigning the value of each element individually.

4. Sum all the elements of the array using a for repetition control structure. Define the integer variable **x** as a control variable for the **for** the loop.

5. Sum the value 3.333 to the fourth element of the array

6. Refer to array element five – write its index/subscript value

7. Write a loop that will double the value of every item in **someArray**.

8. Write a loop that will display all the items in the array greater than or equal to 5.
