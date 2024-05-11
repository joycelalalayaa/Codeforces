import java.util.*;

public class CF944BDavidVersion {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            char[] arr = input.toCharArray();
            int diffIndex=-1;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]!=arr[0]) diffIndex=i;
            }
            if (diffIndex==-1) {
                System.out.println("NO");
                continue;
            }
            char temp=arr[0];
            arr[0]=arr[diffIndex];
            arr[diffIndex]=temp;
            System.out.println("YES");
            System.out.println(arr);
        }

    }
}
