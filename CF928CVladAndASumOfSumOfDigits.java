import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class CF928CVladAndASumOfSumOfDigits {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int testcases = fs.nextInt();

        int[] preFix = new int[300000];
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = preFix[i-1] + getDigitSum(i);
        }
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            out.println(preFix[len]);
        }
        out.close();
    }

    static int getDigitSum(int original){
        int totalSum = 0;
        while (original > 0){
            totalSum += original % 10;
            original /= 10;
        }
        return totalSum;
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

