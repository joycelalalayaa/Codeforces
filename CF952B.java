import java.util.*;

public class CF952B {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            int bestX = 2;
            int maxSum = 0;
            
            for (int x = 2; x <= n; x++) {
                int sum = 0;
                for (int k = 1; k * x <= n; k++) {
                    sum += k * x;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    bestX = x;
                }
            }
            
            System.out.println(bestX);
        }
    }
}
