import java.util.Scanner;

public class EvenSums2DavidVersion {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            long a = fs.nextInt();
            long b = fs.nextInt();
            long inBetween = evenSum(b) - evenSum(a - 1);
            // if (a % 2 == 0) {
            //     inBetween = evenSum(b) - evenSum(a) + a;
            // } else {
            //     inBetween = evenSum(b) - evenSum(a);
            // }
            System.out.printf("even sum between %d and %d is %d\n", a, b, inBetween);
        }
    }

    public static long evenSum(long n) {
        long evenSum = 0;
        evenSum = (n / 2) * (n / 2 + 1);
        return evenSum;
    }
}
