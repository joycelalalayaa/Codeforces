import java.util.*;

public class CF932AEntertainmentInMAC {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int num = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            boolean ifStopped = false;
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] > arr[arr.length - 1 - i]) {
                    ifStopped = true;
                    break;
                } else if (arr[i] == arr[arr.length - 1 - i]) {
                    continue;
                } else {
                    break;
                }
            }
            if (ifStopped) {
                reverse(arr);
                System.out.print(arr);
                reverse(arr);
                System.out.print(arr);
            } else {
                System.out.print(arr);
            }
            System.out.println();
        }
    }

    private static void reverse(char[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
