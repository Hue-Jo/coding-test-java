import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 비번 길이
        int M = scanner.nextInt(); // 문자 종류 개수
        int A = scanner.nextInt(); // 정수 (코드에는 별로 필요 없지 않나..? )
        int H = scanner.nextInt();  //(해시값 (0이상, M 미만의 정수 = M개))

        // 비번 조합 = M^N개
        // H와 일치하는 비번의 개수 = M^(N-1)개)
        // 각 자릿수는 0부터 M−1까지의 값을 가질 수 있다.

        long pwCount = 1L; // (pwCount = 입력한 해시값을 가지는 비번의 갯수, 일단 1개로 초기화)
        for (int i = 0; i < N - 1; i++) {
            pwCount = (pwCount * M) % 1000000007;
        }
        System.out.println(pwCount);
    }
}