import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class NumberPi {

    public BigDecimal Pi (int numberOfDigits){

        BigDecimal decimal = new BigDecimal(Math.PI).setScale(numberOfDigits, RoundingMode.HALF_UP);

        return decimal;
    }

    public static void main (String[] args){
        System.out.println("Enter number to generate Pi: ");
        Scanner scanner = new Scanner(System.in);

        NumberPi number = new NumberPi();

        System.out.println(number.Pi(scanner.nextInt()).toString());
    }
}
