package Factorial;
import java.util.Scanner;
/*
Write a program that prints a factorial to the screen.

The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:

4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built-in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
 */

public class Factorial {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.print("What number would you like to compute the factorial for? ");
        int input = num.nextInt();

        if (input < 0){
            System.out.println("Please enter a positive integer");
        } else {
            long factorial = 1;
            for (int i = 1; i <= input; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
