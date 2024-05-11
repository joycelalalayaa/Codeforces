import java.util.*;
public class Hello2022AStableArrangementOfRooks {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt(), k = fs.nextInt();

            if (k > (n + 1) / 2) {
                System.out.println("-1");
                continue;
            }

            char[][] s = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    s[i][j] = '.';
                }
            }

            for (int i = 0; i < k; i++) {
                s[2 * i][2 * i] = 'R';
            }

            for (int i = 0; i < n; i++) {
                System.out.println(new String(s[i]));
            }
        }
    }
}
