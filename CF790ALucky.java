import java.util.*;
public class CF790ALucky {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            char[] arr = input.toCharArray();
            if(arr[0] + arr[1] + arr[2] == arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3]){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}