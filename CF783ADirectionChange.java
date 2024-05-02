import java.util.*;

public class CF783ADirectionChange {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int x = fs.nextInt(), y = fs.nextInt();
            if (x < y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (x > 2 && y == 1) {
                System.out.println(-1);
            } else {
                System.out.println(((x + y) % 2 == 0) ? (2 * x - 2) : (2 * x - 3));
            }
        }
    }
}
