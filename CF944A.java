import java.util.*;
public class CF944A {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int a = fs.nextInt(), b = fs.nextInt();
            System.out.println(Math.min(a, b) + " " + Math.max(a, b));

        }
    }
}
