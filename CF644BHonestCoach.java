import java.util.*;

public class CF644BHonestCoach {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = fs.nextInt();
            }

            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE;

            for (int i = 1; i < len; i++) {
                minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
            }

            if (minDiff == 0) {
                System.out.println(0);
            } else {
                System.out.println(minDiff);
            }
        }
    }
}
