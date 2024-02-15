import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class CoolKidTrick {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out); // fast print
        out.println("Good morning");
        
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 100-i;
        }
        ruffleSort(arr);
        String joycesString = Arrays.toString(arr);
        out.println(joycesString);

        FastScanner fs = new FastScanner();
        out.println("How long you want the length to be? ");
        out.flush();
        int length = fs.nextInt();
        // int[] readInArr = new int[length];
        // for(int i = 0; i < length; i++){
        //     readInArr[i] = fs.nextInt();
        // }
        int[] readInArr = fs.readArray(length); // shorter code for the four line code above because David wrote below in FastScanner
        out.println(Arrays.toString(readInArr));
        
        out.close(); // otherwise it wont print
    }
    // ruffleSort
    static final Random random = new Random();
    static void ruffleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
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

