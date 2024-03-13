import java.util.*;

public class CF933BRudolfAnd121 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }

            for (int i = 0; i < len - 2; i++) {
                if (arr[i] < 0) {
                    System.out.println("NO");
                    continue outer;
                }
                int num = arr[i];
                arr[i] -= num;
                arr[i + 1] -= 2 * num;
                arr[i + 2] -= num;
            }
            if (arr[len - 1] == 0 && arr[len - 2] == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
