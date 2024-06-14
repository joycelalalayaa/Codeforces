import java.util.Scanner;

public class SkiResort {

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testCases = fs.nextInt();

        for (int testCase = 0; testCase < testCases; testCase++) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int q = fs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            long ans = 0;
            int len = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= q) {
                    len++;
                } else {
                    if (len >= k) {
                        ans += (long) (len - k + 1) * (len - k + 2) / 2;
                    }
                    len = 0;
                }
            }
            if (len >= k) {
                ans += (long) (len - k + 1) * (len - k + 2) / 2;
            }
            System.out.println(ans);
        }
    }
}
