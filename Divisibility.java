package divisibility;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        System.out.println("Enter the dividend: ");
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();
        if (divisor == 0){
            System.out.println(dividend + " is not divisible by " + divisor);
        } else if (dividend % divisor == 0){
            System.out.println(dividend + " is divisible by " + divisor);
        }
        input.close();
    }
}
