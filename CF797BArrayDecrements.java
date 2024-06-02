import java.util.*;

public class CF797BArrayDecrements {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr1 = new int[len];
            int[] arr2 = new int[len];
            for (int i = 0; i < len; i++) {
                arr1[i] = fs.nextInt();
            }
            for (int i = 0; i < len; i++) {
                arr2[i] = fs.nextInt();
            }

            boolean ifWork = true;
            int maxDifference = 0;
            for(int i = 0; i < len; i++){
                maxDifference = Math.max(maxDifference, arr1[i] - arr2[i]);
            }
            for(int i = 0; i < len; i++){
                if(arr1[i] - arr2[i] != maxDifference && arr2[i] != 0){
                    ifWork = false;
                }
            }
            System.out.println(ifWork ? "YES" : "NO");
        }
    }
}
