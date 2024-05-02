import java.util.Scanner;

/*
 * 
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
0 0 0 0 0 0 0 0 0 0  1  1  1  1  1  1  1  1  1  1  2  2
0 0 0 0 0 0 0 0 0 1  1  1  1  1  1  1  1  1  1  2  2  2

 */

public class Harbor20212022ADigitsSum {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            // int n = fs.nextInt();
            // int lastDigit = n % 10;
            // System.out.println(lastDigit == 9 ? n / 10 + 1 : n / 10);
            System.out.println((fs.nextInt() + 1) / 10);
        }
    }
}
