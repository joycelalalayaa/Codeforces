import java.util.*;
public class EducationalCF109BPermutationSort {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            int ans = 2;
            if (isSorted(a)) {
                ans = 0;
            } else if (a[0] == 1 || a[n - 1] == n) {
                ans = 1;
            } else if (a[0] == n && a[n - 1] == 1) {
                ans = 3;
            }

            System.out.println(ans);
        }
        
    }
    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
