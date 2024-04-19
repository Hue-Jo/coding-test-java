import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputs = input.split(" ");

        BigInteger a = new BigInteger(inputs[0]);
        BigInteger b = new BigInteger(inputs[1]);
        BigInteger result = a.multiply(b);
        
        System.out.println(result);

    }
}
