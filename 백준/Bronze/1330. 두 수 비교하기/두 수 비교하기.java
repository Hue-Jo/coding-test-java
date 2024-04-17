import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 수를 한 줄에 공백 있이 입력하고
        // 공백을 기준으로 잘라 배열에 넣기
        String[] nums = scanner.nextLine().split(" ");

        int originalA = Integer.parseInt(nums[0]);
        int originalB = Integer.parseInt(nums[1]);

        if (originalA > originalB) {
                System.out.println(">");
            } else if (originalA < originalB) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        scanner.close();
    }
}