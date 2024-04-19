import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger plus = a.add(b);
        BigInteger minus = a.subtract(b);
        BigInteger multiply = a.multiply(b);

        BigInteger[] result = {plus, minus, multiply};

        for (BigInteger bigInteger : result) {
            System.out.println(bigInteger);
        }
    }
}