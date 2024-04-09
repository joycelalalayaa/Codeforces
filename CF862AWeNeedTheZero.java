import java.util.*;
public class CF862AWeNeedTheZero {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tt = 0; tt < testcases; tt++) {
            int num = fs.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = fs.nextInt();
            }
            int xor = 0;
            for (int x : arr) {
                xor ^= x;
            }
            if (xor == 0) {
                System.out.println(0);
            } else {
                if (num % 2 == 1) {
                    System.out.println(xor);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
