import java.util.Arrays;
import java.util.Scanner;

public class CFTechnocup2022EliminationRound3ALifeOfAFlower {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            // System.out.println(Arrays.toString(arr));
            /*
             * ans = 6;
             * len = 2;
             * i = 1
             * 0 < 2 - 1
             * i
             * 1 1
             * 
             * 1 0 1 1 0
             * 1 0 1 5
             * 
             * 
             */
            int ans = 1;
            int dCouple = 0;
            boolean print = false;
            for (int i = 0; i < len - 1; i++) {
                if (print == false && arr[i] == 0 && arr[i + 1] == 0) {
                    print = true;
                    System.out.println("-1");
                } else if (arr[i] == 1 && arr[i+1] == 1) {
                    dCouple ++;
                }
            }
            for(int i = 0; i < len; i++){
                ans += arr[i];
            }
            // also doable
            // for(int i : arr){
            //     ans += i;
            // }
            if (print == false) {
                System.out.println(ans + dCouple * 4);
            }
        }
    }
    // 0 0
    // 0 1
    // 1 0
    // 1 1
}
