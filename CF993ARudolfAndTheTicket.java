import java.util.*;
public class CF993ARudolfAndTheTicket {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len1 = fs.nextInt(), len2 = fs.nextInt(), k = fs.nextInt();
            int[] arr1 = new int[len1];
            int[] arr2 = new int[len2];
            for(int i = 0; i < len1; i++){
                arr1[i] = fs.nextInt();
            }
            for(int i = 0; i < len2; i++){
                arr2[i] = fs.nextInt();
            }
            int nums = 0;
            for(int i = 0; i < len1; i++){
                for(int j = 0; j < len2; j++){
                    if(arr1[i] + arr2[j] <= k){
                        nums++;
                    }
                }
            }
            System.out.println(nums);
        }
    }
}
