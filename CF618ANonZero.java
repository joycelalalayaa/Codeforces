import java.util.Scanner;

public class CF618ANonZero {
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
            int zeroCount = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] == 0) {
                    zeroCount++;
                }
                sum += arr[i];
            }
            if (sum == 0 && zeroCount == 0) {
                System.out.println(1);
            }
            else if ((0 - sum) == zeroCount && zeroCount != 0) {
            System.out.println(zeroCount + 1);
            }
            else {
                System.out.println(zeroCount);
            }

        }
    }
}
/*
sum = 0; 0 = 0;
move = 1;

sum = 0; 0 = 
move = zeroCount;

sum = -1; 0 = 1;
move = 
 */
