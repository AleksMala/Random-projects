import java.util.Scanner;

public class PrimeNumber {

    public static boolean primeMethode(int number) {
        if (number % 2 == 0) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        while (PrimeNumber.primeMethode(scanner.nextInt()) == false) {
            System.out.println("Not a prime number, try one more time");
        }
        System.out.println("You got prime number ;)");
    }
}
