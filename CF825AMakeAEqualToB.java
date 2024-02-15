import java.util.Arrays;
import java.util.Scanner;

/*
1 0 1
0 0 1
 */
public class CF825AMakeAEqualToB {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arrA = new int[len];
            int[] arrB = new int[len];
            for (int i = 0; i < len; i++) {
                arrA[i] = fs.nextInt();
            }
            for (int i = 0; i < len; i++) {
                arrB[i] = fs.nextInt();
            }

            int differentCount = 0;
            int aOnes = 0;
            int bOnes = 0;
            // System.out.println(Arrays.toString(arrB));
            for (int i = 0; i < len; i++) {
                if (arrA[i] != arrB[i]) {
                    differentCount++;
                }
                if (arrA[i] == 1) {
                    aOnes++;
                }
                if (arrB[i] == 1) {
                    bOnes++;
                }

            }
            if (aOnes == bOnes && differentCount != 0) {
                System.out.println(1);
            }
            if (aOnes != bOnes && differentCount != Math.abs(aOnes - bOnes)) {
                System.out.println(Math.abs(aOnes - bOnes) + 1);
            }
            if (aOnes != bOnes && differentCount == Math.abs(aOnes - bOnes)) {
                System.out.println(Math.abs(aOnes - bOnes));
            }
            if (aOnes == bOnes && differentCount == 0) {
                System.out.println(0);
            }

            // System.out.println("aOnes: " + aOnes);
            // System.out.println("bOnes: " + bOnes);
            // System.out.println("differences: " + differentCount);
        }
    }
}
