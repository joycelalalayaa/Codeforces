import java.util.Scanner;

public class CF878CSkiResort {

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();

        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int q = fs.nextInt();

            int[] temperatures = new int[n];
            for (int j = 0; j < n; j++) {
                temperatures[j] = fs.nextInt();
            }

            int count = 0;
            int consecutiveDays = 0;

            for (int i = 0; i < n; i++) {
                if (temperatures[i] <= q) {
                    // consecutiveDays++;
                    count++;
                } else {
                    consecutiveDays = 0;
                    count = 0;
                }

                // if (consecutiveDays >= k) {
                //     count++;
                // }
            }

            System.out.println(count);
        }
    }
}
