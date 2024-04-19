import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true) {
                String input = br.readLine();
                String[] inputs = input.split(" ");
                int first = Integer.parseInt(inputs[0]);
                int second = Integer.parseInt(inputs[1]);

                if (first == 0 && second== 0) {
                    break;
                } else if (first > second) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
    }