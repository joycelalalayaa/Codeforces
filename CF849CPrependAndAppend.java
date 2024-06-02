import java.util.*;

public class CF849CPrependAndAppend {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            int ans = len;
            if (len >= 2) {
                for (int i = 0; i < len / 2; i++) {
                    int j = len - 1 - i;
                    if (arr[i] == '1' && arr[j] == '0' || arr[i] == '0' && arr[j] == '1') {
                        ans -= 2;
                    } else {
                        break;
                    }
                }
                // System.out.println(ans);
            } 
            System.out.println(len == 1 ? 1 : ans);

        }
    }
}
