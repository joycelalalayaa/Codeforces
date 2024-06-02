import java.util.*;

public class CF917ALeastProduct {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int neg = 0, zero = 0, index = 0;
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
                // ans *= arr[i];
                if (arr[i] < 0) {
                    neg++;
                    index = i;
                }
                if (arr[i] == 0) {
                    zero++;
                }
            }
            if (zero > 0 || neg % 2 != 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
                System.out.println(index + 1 + " " + 0);
            }
        }
    }
}
