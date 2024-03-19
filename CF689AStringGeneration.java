import java.util.*;

/*

arr.len = 10
i     i     i     i
0 1 2 3 4 5 6 7 8 9
a b c a b c a b c 0
 */
public class CF689AStringGeneration {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt(), panLen = fs.nextInt();
            // char[] arr = new char[1000];
            // for (int i = 0; i < arr.length; i++) {
            //     arr[i] = (char) ('a' + i % 3);
            // }
            for (int i = 0; i < len; i++) {
                System.out.print((char)('a' + i % 3));
            }
            System.out.println();
        }
    }
}
