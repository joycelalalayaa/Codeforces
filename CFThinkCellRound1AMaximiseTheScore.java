import java.util.*;

public class CFThinkCellRound1AMaximiseTheScore {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len * 2];
            for (int i = 0; i < len * 2; i++) {
                arr[i] = fs.nextInt();
            }
            Arrays.sort(arr);
            long ans = 0;

            for (int i = 0; i < len; i++) {
                ans += Math.min(arr[2 * i], arr[2 * (i + 1)]);
            }
            System.out.println(ans);
        }
    }
}
