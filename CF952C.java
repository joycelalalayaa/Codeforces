import java.util.Scanner;

public class CF952C {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            long[] a = new long[len];
            
            for (int i = 0; i < len; i++) {
                a[i] = fs.nextLong();
            }
            
            int goodPrefixCount = 0;
            long prefixSum = 0;

            long largestElement = Long.MIN_VALUE;

            for (int i = 0; i < len; i++) {
                prefixSum += a[i];
                largestElement = Math.max(largestElement, a[i]);

                long sumWithoutLargest = prefixSum - largestElement;
                if (largestElement == sumWithoutLargest) {
                    goodPrefixCount++;
                }
            }
            
            System.out.println(goodPrefixCount);
        }
    }
}
