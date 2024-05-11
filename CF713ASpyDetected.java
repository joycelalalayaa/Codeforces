import java.util.*;

public class CF713ASpyDetected {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = fs.nextInt();
            }
            int num1 = arr[0], num2 = 0, freq1 = 1, minority = 0, index = 0;
            for(int i = 1; i < len; i++){
                if(arr[i] == num1){
                    freq1++;
                } else {
                    num2 = arr[i];
                    // freq2++;
                }
            }
            if(freq1 == 1){
                minority = num1;
            } else {
                minority = num2;
            }
            for(int i = 0; i < len; i++){
                if(arr[i] == minority){
                    index = i+1;
                }
            }
            System.out.println(index);
            // System.out.println(majority + " , " + minority);
            // System.out.println(aFreq + " , " + iFreq);
        }
    }
}
