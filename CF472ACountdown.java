import java.util.*;

public class CF472ACountdown {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            int deduc = 0;
            int swap = 0;
            for (int i = 0; i < len; i++) {
                if(arr[i] != '0'){
                    deduc += arr[i] - 48;
                    swap++;
                }
            }
            System.out.println(arr[len - 1] != '0' ? (swap + deduc - 1) : swap + deduc);
        }
    }
}
