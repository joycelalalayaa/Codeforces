import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CF886DBalancedRound {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int length = fs.nextInt();
            int gap = fs.nextInt();
            int[] arr = new int[length];
            for (int a = 0; a < length; a++) {
                arr[a] = fs.nextInt();
            }
            // Arrays.sort(arr);
            ruffleSort(arr);
            // System.out.println(Arrays.toString(arr));
            if (length == 1) {
                out.println(0);
                continue;
            }
            int majority = 1;
            int group = 1;
            for (int i = 0; i < length - 1; i++) {
                if (Math.abs(arr[i] - arr[i + 1]) <= gap) {
                    group++;
                } else {
                    group = 1;
                }
                if (majority < group) {
                    majority = group;
                    // out.println("HIIII");
                }
            }
            // out.println(length);
            // out.println(majority);

            out.println(length - majority);
        }
        out.close();
    }
    
    static final Random random = new Random();
 
	static void ruffleSort(int[] a) {
		int n = a.length;// shuffle, then sort
		for (int i = 0; i < n; i++) {
			int oi = random.nextInt(n), temp = a[oi];
			a[oi] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
}
