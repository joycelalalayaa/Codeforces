import java.util.*;

public class maxTwoNotAdjacent {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            int ans = 0;
            // int leftBegin = 0;
            int prefixMax = Integer.MIN_VALUE;
            for (int rightIndex = 2; rightIndex < len; rightIndex++) {
                // for (int leftIndex = leftBegin; leftIndex<= rightIndex-2; leftIndex++) {
                // prefixMax = Math.max(prefixMax, arr[leftIndex]);
                prefixMax = Math.max(prefixMax, arr[rightIndex - 2]);
                ans = Math.max(ans, prefixMax + arr[rightIndex]);
                // leftBegin++;
                // }
            }
            System.out.println(ans);
        }
    }
}
