import java.util.*;

public class CF944C {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt(), d = fs.nextInt();
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (c > d) {
                int temp = c;
                c = d;
                d = temp;
            }

            boolean intersects = (a < c && c < b && b < d) || (c < a && a < d && d < b);

            System.out.println(intersects ? "YES" : "NO");

        }
    }
}