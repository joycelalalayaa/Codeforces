import java.util.*;

public class CF716APerfectlyImperfectArray {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            boolean[] tOrF = new boolean[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            for (int i = 0; i < len; i++) {
                int squareRoot = (int) Math.sqrt(arr[i]);
                if (squareRoot * squareRoot == arr[i] || (squareRoot + 1) * (squareRoot + 1) == arr[i]) {
                    tOrF[i] = true;
                }
                // for (int j = 1; j * j <= arr[i]; j++) {
                //     if (j * j == arr[i]) {
                //         tOrF[i] = true;
                //     }
                // }
            }
            for (int i = 0; i < len; i++) {
                if (!tOrF[i]) {
                    System.out.println("YES");
                    continue outer;
                }
            }

            System.out.println("NO");

        }
    }
}
