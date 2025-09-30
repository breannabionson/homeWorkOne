package isInteger;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
    public static boolean isInteger(String str) {
        for (char c : str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return !str.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isInteger("123"));
        System.out.println(isInteger("hello"));
    }
}
