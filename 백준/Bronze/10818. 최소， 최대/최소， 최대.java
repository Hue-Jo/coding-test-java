import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        // 공백으로 입력하라고 했으니까 일단 문자열로 저장
        String secondNums = scanner.nextLine();
        // 공백으로 구분해서 하나하나 떼서 배열에 넣기
        String[] nums = secondNums.split(" ");

        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int original = Integer.parseInt(nums[i]);
            if (min > original) {
                min = original;
            }
        }
        System.out.print(min);
        System.out.print(" ");

        for (int i = 0; i < nums.length; i++) {
            int original = Integer.parseInt(nums[i]);
            if (max < original) {
                max = original;
            }
        }
        System.out.println(max);
    }
}
