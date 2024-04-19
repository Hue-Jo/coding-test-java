import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //입력을 위한 버퍼리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        
        char ch = input.charAt(0);
        int asciiValue = (int) ch;
        System.out.println(asciiValue);
    }
}
