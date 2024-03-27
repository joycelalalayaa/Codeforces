import java.util.*;
public class CF726AArithmeticArray {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            int sum = 0;
            for(int i = 0; i < len; i++){
                arr[i] = fs.nextInt();
                sum += arr[i];
            }
            if(sum < 0 || (sum - len) < 0){
                System.out.println(1);
            } else {
                System.out.println(sum - len);
            }
            System.out.println((sum < 0 || (sum - len) < 0) ? 1 : (sum-len));
        }
    }
}