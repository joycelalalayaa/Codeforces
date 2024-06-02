import java.util.*;

public class CF827BIncreasing {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            Arrays.sort(arr);
            if(len == 0){
                System.out.println("YES");
            } else {
                boolean a = true;
                for (int i = 0; i < len-1; i++) {
                    if(arr[i] >= arr[i+1]){
                        a = false;
                    }
                }
                System.out.println(a ? "YES" : "NO");
            }
            }
    }
}
