import java.util.*;

public class CF838ADivideAndConquer {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            long sum = 0;
            long ans = 21;
            long[] a = new long[(int) len];
            for (int i = 0; i < len; i++) {
                a[i] = fs.nextLong();
                sum += a[i];
            }
            if ((sum & 1) == 1) {
                for (long it : a) {
                    long cur = it;
                    long now = 0;
                    while (!((cur + it) % 2 == 1)) {
                        now++;
                        cur /= 2;
                    }
                    ans = Math.min(ans, now);
                }
            } else {
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}
