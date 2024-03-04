import java.util.*;

public class CF848AFlipFlopSum {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            int sum = 0;
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
                sum += arr[i];
            }

            int maxSum = sum;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] == -1 && arr[i + 1] == -1) {
                    maxSum = Math.max(maxSum, sum + 4);
                } else if (sum == len) {
                    maxSum = sum - 4;
                } else if (sum == 0 - len) {
                    maxSum = sum + 4;
                }
            }

            System.out.println(maxSum);
        }
    }
}
