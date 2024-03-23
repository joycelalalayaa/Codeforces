import java.util.*;

public class CF804ATheThirdThreeNumberProblem {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int num = fs.nextInt();
            if (num % 2 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(num / 2 + " " + num / 2 + " " + 0);
            }
        }
    }
}
