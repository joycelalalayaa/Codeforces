import java.util.*;

public class CF875BArrayMerging {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[2 * len];
            for (int i = 0; i < 2 * len; i++) {
                arr[i] = fs.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int count = 0;
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            for(int i = 0; i < 2 *len - 1; i++){
                if(arr[i] == arr[i+1]){
                    count++;
                }
            }
            if(count > 0){
            System.out.println(count);}
            else{
                System.out.println(1);
            }
        }
    }
}
