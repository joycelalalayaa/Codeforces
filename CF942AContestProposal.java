import java.util.*;

public class CF942AContestProposal {
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
            int ans = 0;
            int timesRight = 0;
            for (int topIndex = 0; topIndex < len; topIndex++) {
                while (topIndex + timesRight < len && arr1[topIndex] > arr2[topIndex + timesRight]) {
                    timesRight++;
                }
                ans = Math.max(ans, timesRight);
            }

            System.out.println(ans);

        }
    }
}
/*
 * 4 5 6 7 8 9
 * 1 2 4 6 7 8
 * 
 * 1 4 5 6 7 8
 * 1 2 4 5 6 7
 * 1 2 4 4 5 6
 * 
 * 
 * 6
 * 1000 1400 2000 2000 2200 2700
 * 800 1200 1500 1800 2200 3000
 * 
 * 
 * 
 * 7 7 8 8 8 100 101 102
 * 5 5 5 5 5 5 9 9
 */