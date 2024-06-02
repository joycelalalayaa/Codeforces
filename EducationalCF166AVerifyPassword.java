import java.util.*;

public class EducationalCF166AVerifyPassword {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            boolean ifTrue = true;
            for (int i=1; i<len; i++) {
                // if (arr[i-1] > arr[i]){
                //     ifTrue = false;
                // }
                // ifTrue = ifTrue && arr[i-1]<=arr[i];
                ifTrue &= arr[i-1]<=arr[i];
            }
            System.out.println(ifTrue ? "YES" : "NO");
        }
    }
}
