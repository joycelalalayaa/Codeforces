import java.util.*;

public class Goodbye2021AIntegerDiversity {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] freq = new int[101];  

            for (int i = 0; i < len; i++) {
                int num = Math.abs(fs.nextInt());  
                if (num <= 100) {
                    freq[num]++;
                }
            }

            int result = 0;
            for (int x = 0; x <= 100; x++) {
                if (x == 0) {
                    result += Math.min(1, freq[x]);
                } else {
                    result += Math.min(2, freq[x]);
                }
            }

            System.out.println(result);
        }
        fs.close();
    }
}

/*
1 1 1 1 2 2 3 3
len = 8, noDup = 3
ans = 6

1 2 3 4 5 6 7 8
len = 8, noDup = 8
ans = 8

1 1 1 1 2 3 5 8 8
len = 9, noDup = 5
ans = 7
 */
