import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 한 줄로 입력 받기 위해서 문자열로 일단 넣기
        String numLine = scanner.nextLine();

        // 입력받은 값을 공백 기준으로 나눠서 한 놈 한 놈 저장
        String[] nums = numLine.split(" ");

        // 입력받은 값을 long 형으로 형변환해서 저장
        long a = Long.parseLong(nums[0]);
        long b = Long.parseLong(nums[1]);
        long c = Long.parseLong(nums[2]);

        System.out.println(a+b+c);
    }
}
