import java.util.*;

public class EducationalCF163ASpecialCharacters {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = { 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H', 'I', 'I',
                    'J', 'J', 'K', 'K', 'L', 'L', 'M', 'M', 'N', 'N', 'O', 'O', 'P', 'P', 'Q', 'Q', 'R', 'R', 'S', 'S',
                    'T', 'T', 'U', 'U', 'V', 'V', 'W', 'W', 'X', 'X', 'Y', 'Y', 'Z', 'Z' };
            if (len % 2 == 1) {
                System.out.println("NO");
            } else if (len % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < len; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
