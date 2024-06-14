import java.util.*;

public class CF952A {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String a = fs.next();
            String b = fs.next();

            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);

            System.out.println(newA + " " + newB);
        }
    }
}
