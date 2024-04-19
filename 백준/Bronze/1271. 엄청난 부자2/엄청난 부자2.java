import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        BigInteger[] result = n.divideAndRemainder(m);
        BigInteger bigAmount = result[0];
        BigInteger remainder = result[1];

        System.out.println(bigAmount);
        System.out.println(remainder);
    }
}