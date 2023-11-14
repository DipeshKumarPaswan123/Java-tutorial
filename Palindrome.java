import java.util.Scanner;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string or number to check palindrome or not");
        String original = in.nextLine();

        if (original == null || original.isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty string.");
            return;
        }

        if (isPalindrome(original)) {
            System.out.println("Enter string is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return str.equals(reverse);
    }
}

































