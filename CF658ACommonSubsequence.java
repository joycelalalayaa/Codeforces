import java.util.Arrays;
import java.util.Scanner;

public class CF658ACommonSubsequence {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int aLen = fs.nextInt(), bLen = fs.nextInt();
            int[] a = new int[aLen], b = new int[bLen];
            for(int i = 0; i < aLen; i++){
                a[i] = fs.nextInt();
            }
            for(int j = 0; j < bLen; j++){
                b[j] = fs.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            // System.out.println(Arrays.toString(a));

            boolean ifTrue = false;
            for(int i = 0; i < aLen; i++){
                for(int j = 0; j < bLen; j++){
                    if(ifTrue == false && a[i] == b[j]){
                        System.out.println("YES");
                        System.out.println(1 + " " + a[i]);
                        ifTrue = true;
                    }
                }
            }
            if(ifTrue == false){
                System.out.println("NO");
            }
        }
    }
}
