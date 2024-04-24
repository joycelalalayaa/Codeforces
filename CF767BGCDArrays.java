import java.util.*;

public class CF767BGCDArrays {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int l = fs.nextInt(), r = fs.nextInt(), k = fs.nextInt();
            if (l == r) {
                if (l == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                int total = r - l + 1;
                int evenCount = r / 2 - (l - 1) / 2;
                int oddCount = total - evenCount;
                if (oddCount <= k) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
