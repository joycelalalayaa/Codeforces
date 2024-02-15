import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF833ARudolphAndCutTheRope {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int testcases = fs.nextInt();
        for(int tc = 0; tc < testcases; tc++){
            int ans = 0;
            int nRopes = fs.nextInt();
            int aLen = 2 * nRopes;
            int[] arr = fs.readArray(aLen);

            for(int i = 0; i < aLen; i++){
                if(i % 2 == 0 && arr[i+1] < arr[i]){
                    ans++;
                }
            }
            out.println(ans);
        }
        out.close();
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
