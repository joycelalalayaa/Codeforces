import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;

public class CF888BParitySort {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int aLen = fs.nextInt();
            int[] arr = new int[aLen];
            boolean[] even = new boolean[aLen];
            boolean[] odd = new boolean[aLen];

            for (int i = 0; i < aLen; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] % 2 == 0) {
                    even[i] = true;
                } else {
                    odd[i] = true;
                }
            }

            int[] sorted = Arrays.copyOf(arr, aLen);
            ruffleSort(sorted);
            boolean[] ans = new boolean[aLen];
            for (int i = 0; i < aLen; i++) {
                if (sorted[i] % 2 == 0 && even[i] || sorted[i] % 2 != 0 && odd[i]) {
                    ans[i] = true;
                } else {
                    ans[i] = false;
                }
            }
            // System.out.println(Arrays.toString(ans));

            boolean anyFalses = false;
            for (boolean b : ans) {
                if (b == false) {
                    anyFalses = true;
                }
            }

            if (anyFalses == true) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            // System.out.println(Arrays.toString(sorted));
        }
    }

    static final Random random = new Random();

    static void ruffleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int toSwapWith = random.nextInt(n);

            // swap a[i] with a[toSwapWith]
            int temp = a[toSwapWith];
            a[toSwapWith] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
