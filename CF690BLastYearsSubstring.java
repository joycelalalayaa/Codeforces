import java.util.*;

/*
XXXXXXXXXX
oooo
o      ooo
oo      oo
ooo      o
oooo

 */
public class CF690BLastYearsSubstring {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            String input = fs.next();
            char[] arr = input.toCharArray();
            if (arr[0] == '2' && arr[1] == '0' && arr[2] == '2' && arr[3] == '0') {
                System.out.println("YES");
            } else if (arr[len - 4] == '2' && arr[len - 3] == '0' && arr[len - 2] == '2' && arr[len - 1] == '0') {
                System.out.println("YES");
            } else if (arr[0] == '2' && arr[len - 3] == '0' && arr[len - 2] == '2' && arr[len - 1] == '0') {
                System.out.println("YES");
            } else if (arr[0] == '2' && arr[1] == '0' && arr[2] == '2' && arr[len - 1] == '0') {
                System.out.println("YES");
            } else if (arr[0] == '2' && arr[1] == '0' && arr[len-2] == '2' && arr[len-1] == '0') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
