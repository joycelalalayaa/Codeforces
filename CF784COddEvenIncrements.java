import java.util.*;

public class CF784COddEvenIncrements {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            int evenOdd = 0;
            int oddOdd = 0;
            for (int i = 0; i < len; i += 2) {
                if (arr[i] % 2 != 0) {
                    evenOdd++;
                }
            }

            for (int i = 1; i < len; i += 2) {
                if (arr[i] % 2 != 0) {
                    oddOdd++;
                }
            }
            if (evenOdd + oddOdd == len || evenOdd + oddOdd == 0) {
                System.out.println("YES");
            } else if (len % 2 == 0) {
                if ((oddOdd == len / 2 && evenOdd == 0) || (oddOdd == 0 && evenOdd == len / 2)
                        || (oddOdd == 0 && evenOdd == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if ((oddOdd == len / 2 && evenOdd == 0) || (oddOdd == 0 && evenOdd == (len + 1) / 2)
                        || (oddOdd == 0 && evenOdd == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
