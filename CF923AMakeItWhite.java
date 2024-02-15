import java.util.Arrays;
import java.util.Scanner;

public class CF923AMakeItWhite {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            String input = fs.next();
            char[] arr = input.toCharArray();
            int black = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] == 'B') {
                    black++;
                }
            }
            int firstBlack = 0;
            boolean changed = false;

            for (int i = 0; i < len; i++) {
                if (arr[i] == 'B' && changed == false) {
                    firstBlack = i;
                    changed = true;
                }
            }

            int lastBalck = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] == 'B') {
                    lastBalck = i + 1;
                }
            }

            // System.out.println("lastBlack: " + lastBalck);
            // System.out.println("firstBlack: " + firstBlack);
            int consecBlack = 0;
            // int maxBlack = 0;
            if (black > 0) {
                for (int i = 0; i < len - 1; i++) {
                    if (arr[i] == 'B' && arr[i + 1] == 'B') {
                        consecBlack++;
                    }
                }
            }
            System.out.println(lastBalck - firstBlack);

        }
    }
}

/*
 * WBWBWWWBW
 * WWBWBBBWB
 * WWWBWWWBW
 * WWWWBBBWB
 * WWWWWWWBW
 * WWWWWWWWB
 * WWWWWWWWW
 * 
 * 
 * 
 * WWBBWB
 * WWWWBW
 * WWWWWB
 * WWWWWW
 * 
 * WBBWBW
 * WWWBWB
 * WWWWBW
 * WWWWWB
 * WWWWWW
 * 
 * 
 */
