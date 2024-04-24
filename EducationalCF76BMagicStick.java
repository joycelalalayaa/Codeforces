import java.util.*;

public class EducationalCF76BMagicStick {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int num1 = fs.nextInt();
            int num2 = fs.nextInt();
            if (num1 > 3)
                System.out.println("YES");
            else if (num1 == 1)
                System.out.println(num2 == 1 ? "YES" : "NO");
            else
                System.out.println(num2 <= 3 ? "YES" : "NO");

        }
    }
}
