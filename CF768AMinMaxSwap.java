import java.util.*;

public class CF768AMinMaxSwap {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr1 = new int[len];
            int[] arr2 = new int[len];
            int max1 = 0;
            int max2 = 0;
            for (int i = 0; i < len; i++) {
                arr1[i] = fs.nextInt();
            }
            for (int i = 0; i < len; i++) {
                arr2[i] = fs.nextInt();
            }
            for (int i = 0; i < len; i++) {
                if(arr1[i] < arr2[i]){
                    int temp = arr1[i];
                    arr1[i] = arr2[i];
                    arr2[i] = temp;
                }
            }
            for (int i = 0; i < len; i++) {
                max1 = Math.max(max1, arr1[i]);
                max2 = Math.max(max2, arr2[i]);
            }
            System.out.println(max1 * max2);
        }
    }
}
