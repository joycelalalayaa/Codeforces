import java.util.*;

public class CF898AShortSort {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] arr = fs.next().toCharArray();
            if(arr[0] == 'a' || arr[1] == 'b' || arr[2] == 'c'){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}