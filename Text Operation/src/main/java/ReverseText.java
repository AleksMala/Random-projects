import java.util.Scanner;

public class ReverseText {

    public static String reverseText(String text) {

        String reverse = new StringBuffer(text).reverse().toString();

        return reverse;
    }

    public static boolean checkIfPalindrome(String text) {
        System.out.println("Check if palindrome: ");
        return text.equals(reverseText(text));

    }

    public static void main(String[] args) {

        System.out.println("Put the text: ");

        String text = new Scanner(System.in).nextLine();
        System.out.println(ReverseText.reverseText(text));

        System.out.println(ReverseText.checkIfPalindrome(text));

    }
}

