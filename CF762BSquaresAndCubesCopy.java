import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF762BSquaresAndCubesCopy {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            ArrayList<Integer> ansArr = new ArrayList<>();
            for (int i = 1; (long) i * (long) i <= input; i++) {
                ansArr.add(i * i);
            }
            for (int i = 1; (long) i * (long) i * (long) i <= input; i++) {
                ansArr.add(i * i * i);
            }

            Collections.sort(ansArr);
            int ans = ansArr.size();
            for (int i = 0; i < ansArr.size() - 1; i++) {
                if ((int) ansArr.get(i) == (int) ansArr.get(i + 1)) {
                    ans--;
                }

            }

            System.out.println(ans);

        }
    }
}
