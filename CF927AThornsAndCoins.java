import java.util.*;

public class CF927AThornsAndCoins {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            int ans = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] == '@') {
                    ans++;
                } else if (i + 1 < len && arr[i] == '*' && arr[i + 1] == '*') {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

