import java.util.Arrays;
import java.util.Scanner;

public class CF728APrettyPermutations {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();

            int[] ans = new int[len];
            for (int i = 0; i < len; i++) {
                ans[i] = i + 1;
            }

            if (len % 2 == 0) {
                for (int i = 0; i < len - 1; i += 2) {

                    int temp = ans[i];
                    ans[i] = ans[i + 1];
                    ans[i + 1] = temp;

                }
            } else {
                ans[0] = 3;
                ans[1] = 1;
                ans[2] = 2;
                for (int i = 3; i < len - 1; i += 2) {

                    int temp = ans[i];
                    ans[i] = ans[i + 1];
                    ans[i + 1] = temp;
                    // System.out.println("temp: " + temp);
                    // System.out.println("i: " + i + ", ans[i]: " + ans[i]);
                    // System.out.println("i+1: " + (i + 1) + ", ans[i+1]: " + ans[i + 1]);

                    // System.out.println("hiiii i: " + i);

                }

            }
            for (int i = 0; i < len; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
/*
 * 1 2 3 4
 * 2 1 4 3
 * 
 * 1 2 3 4 5
 * 3 1 2 5 4
 * 
 * swap three numbers:
 * temp = ans[i];
 * ans[i] = ans[i+1];
 * ans[i+1] = temp;
 * 
 * 
 */
