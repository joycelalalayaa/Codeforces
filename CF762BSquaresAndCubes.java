import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CF762BSquaresAndCubes {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            ArrayList<Integer> ansArr = new ArrayList<>();
            // square root of n
            // n -> 10^9
            // 10^4.5
            for (int i = 0; i < input; i++) {
                if (i * i <= input) {
                    ansArr.add(i * i);
                } else {
                    break;
                }
            }
            // cubic root of n
            // 10^3
            for (int i = 0; i < input; i++) {
                if (i * i * i <= input) {
                    // ans++;
                    ansArr.add(i * i * i);
                } else {
                    break;
                }
            }

            // square root of n * log(n)
            Collections.sort(ansArr);

            // square root of n
            for (int i = 0; i < ansArr.size() - 1; i++) {
                if ((int) ansArr.get(i) == (int) ansArr.get(i + 1)) {
                    ansArr.remove(i);
                }

            }

            // System.out.println(ansArr);
            if (input == 1) {
                System.out.println(1);
            } else {

                System.out.println(ansArr.size() - 1);
            }
        }
    }
}
