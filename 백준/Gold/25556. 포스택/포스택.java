import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // n사이즈의 순열이야
        int[] arr = new int[size]; // size사이즈의 순열 생성

        Stack<Integer>[] stack = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stack[i] = new Stack<>();
        }

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

            for (int j = 0; j < 4; j++) {
                if (stack[j].isEmpty() || arr[i] > (int)stack[j].peek() ) {
                    stack[j].push(arr[i]);
                    break;
                }
                if (j == 3) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
