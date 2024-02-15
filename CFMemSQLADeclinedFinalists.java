import java.util.Arrays;
import java.util.Scanner;

public class CFMemSQLADeclinedFinalists {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int numIKnow = fs.nextInt();
        int[] arr = new int[numIKnow];
        for(int i = 0; i < numIKnow; i++){
            arr[i] = fs.nextInt();
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int differentNum = 0;
        for(int i : arr){
            if(i > 25){
                differentNum++;
            }
        }
        if(differentNum > 0){
            System.out.println(arr[numIKnow-1] - 25);
        } else {
            System.out.println(0);
        }
        // System.out.println(differentNum);
    }
}
