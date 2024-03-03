import java.util.*;

public class CF931ATooMinTooMax {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            Arrays.sort(arr);
            int ans = Math.abs(arr[0] - arr[len - 2]) + Math.abs(arr[len - 2] - arr[1]) +
                    Math.abs(arr[1] - arr[len - 1]) + Math.abs(arr[len - 1] - arr[0]);
            System.out.println(ans);
        }
    }
}
/*
 * i = 1
 * j = 2
 * k = 2
 * l = 3
 * 
 * i = -3
 * j = 5
 * k = -1
 * l = 10
 * 
 * 8+6+11+13 = 24 + 14 = 38
 */