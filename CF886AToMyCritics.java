import java.util.Scanner;

public class CF886AToMyCritics {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            int c = fs.nextInt();
            if (a + b > 9 || a + c > 9 || b + c > 9) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
