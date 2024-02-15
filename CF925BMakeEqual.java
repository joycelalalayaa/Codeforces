import java.util.Scanner;

public class CF925BMakeEqual {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            long[] arr = new long[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < len; i++) {
                sum += arr[i];
            }
            long ave = sum / len;
            long sufSum = 0;
            for (int i = len - 1; i > 0; i--) {
                sufSum += arr[i];
                if (sufSum > ave * (len - i)) {
                    System.out.println("NO");
                    continue outer;
                }
            }
            System.out.println("YES");
        }
    }
}
