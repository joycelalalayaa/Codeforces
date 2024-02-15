import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class CF888BParitySortDavidsVersion {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int aLen = fs.nextInt();
            int[] arr = fs.readArray(aLen);
            int[] sorted = arr.clone();
            ruffleSort(sorted);
            
            boolean anyFalses = false;
            for (int i = 0; i < aLen; i++) {
                if (sorted[i] % 2 != arr[i] % 2){
                    anyFalses = true;
                }
            }

            System.out.println(anyFalses?"NO":"YES");
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
