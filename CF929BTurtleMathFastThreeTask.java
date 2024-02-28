import java.util.*;

public class CF929BTurtleMathFastThreeTask {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += arr[i];
            }
            int one = 0, two = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] % 3 == 1) {
                    one++;
                } else if (arr[i] % 3 == 2) {
                    two++;
                }
            }
            if (sum % 3 == 0) {
                System.out.println(0);
            } else if (sum % 3 == 1) {
                if (one > 0) {
                    System.out.println(1);
                } else if (two >= 2) {
                    System.out.println(2);
                } 
            } else {
                if (two > 0) {
                    System.out.println(1);
                } else if (one % 3 == 2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}

