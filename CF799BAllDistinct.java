import java.util.HashSet;
import java.util.Scanner;

public class CF799BAllDistinct {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            HashSet<Integer> arr = new HashSet<>();
            for(int i = 0; i < len; i++){
                arr.add(fs.nextInt());
            }
            // System.out.println(arr);
            if((len - arr.size()) % 2 == 0){
                System.out.println(arr.size());
            } else {
                System.out.println(arr.size() - 1);
            }
            // for (int i = 0; i < len; i++) {
            //     arr[i] = fs.nextInt();
            // }
            // int dup = 0;
            // Arrays.sort(arr);
            // for (int i = 0; i < len - 1; i++) {
            //     if(arr[i] == arr[i+1]){
            //         dup++;
            //     }
            // }
            // if(dup % 2 == 0){
            //     System.out.println(len - dup);
            // } else {
            //     System.out.println(len - dup - 1);
            // }
        }
    }
}
