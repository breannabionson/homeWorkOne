package isDivisible;

//Write a method that returns whether a is divisible by b.
//
 //Your method signature should be
//
 //public boolean isDivisible(int a, int b)

public class IsDivisible {
    public boolean isDisivible(int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 0;
    }
    public static void main(String[] args) {
        IsDivisible isDivisible = new IsDivisible();
        System.out.println(isDivisible.isDisivible(1, 2));
    }
}

