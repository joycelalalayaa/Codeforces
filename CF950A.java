import java.util.*;

public class CF950A {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt(), upComingRounds = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));
            int[] num = new int[7];
            for (int i = 0; i < len; i++) {
                if (arr[i] == 'A') {
                    num[0]++;
                } else if (arr[i] == 'B') {
                    num[1]++;
                } else if (arr[i] == 'C') {
                    num[2]++;
                } else if (arr[i] == 'D') {
                    num[3]++;
                } else if (arr[i] == 'E') {
                    num[4]++;
                } else if (arr[i] == 'F') {
                    num[5]++;
                } else {
                    num[6]++;
                }
            }
            int ans = 0;
            for (int i = 0; i < 7; i++) {
                if(num[i] < upComingRounds){
                    ans += Math.abs(upComingRounds - num[i]);
                    // System.out.println(i);
                }
            }
            System.out.println(ans);
            // for (int i = 0; i < 7; i++) {
            //     System.out.print(num[i]);
            // }
            // System.out.println();
        }
    }
}
