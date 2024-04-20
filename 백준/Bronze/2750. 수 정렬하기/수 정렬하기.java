import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            nums[i] = a;
        }
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}