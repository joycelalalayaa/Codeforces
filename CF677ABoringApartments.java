import java.util.*;

public class CF677ABoringApartments {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String num = fs.next();
            System.out.println((num.charAt(0) - '1') * 10 + num.length() * (num.length() + 1) / 2);
            // int[] arr = { 1, 11, 111, 1111, 2, 22, 222, 2222, 3, 33, 333, 3333, 4, 44,
            //         444, 4444, 5, 55, 555, 5555, 6,
            //         66, 666, 6666, 7, 77, 777, 7777, 8, 88, 888, 8888, 9, 99, 999, 9999 };
            // int[] ans = { 1, 3, 6, 10, 11, 13, 16, 20, 21, 23, 26, 30, 31, 33, 36, 40,
            //         41, 43, 46, 50, 51, 53, 56, 60,
            //         61, 63, 66, 70, 71, 73, 76, 80, 81, 83, 86, 90, 91, 93, 96, 100 };
            // int num = fs.nextInt();
            // int index = 0;
            // for (int i = 0; i < arr.length; i++) {
            //     if (arr[i] == num) {
            //         index = i;
            //     }
            // }
            // System.out.println(ans[index]);
        }
    }
}
