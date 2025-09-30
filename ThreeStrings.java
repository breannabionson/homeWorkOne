package threeStrings;
import java.util.Scanner;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

public class ThreeStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Asks for three strings
        System.out.print("First string? ");
        String first = scanner.next();
        System.out.print("Second string? ");
        String second = scanner.next();
        System.out.print("Third string? ");
        String third = scanner.next();

        // Check if first + second equals third
        if ((first + second).equals(third)){
            System.out.println("Yes! \"" + first + "\" + \"" + second + "\" equals \"" + third + "\"");
        } else {
            System.out.println("No! \"" + first + "\" + \"" + second + "\" does NOT equal \"" + third + "\"");
        }
        scanner.close();
        }
    }
