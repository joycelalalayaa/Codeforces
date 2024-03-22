import java.util.*;

public class CF867CBunLover {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            long num = fs.nextInt();
            System.out.println(num * num + 2 * (num + 1));
        }
    }
}