import java.util.*;

public class CF929CTurtleFingersCountTheValuesOfK {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int a = fs.nextInt(), b = fs.nextInt(), l = fs.nextInt();
            int n = 0;
            for (int i = 1; i < l; i++) {
                if (l % i == 0) {
                    n++;
                }
            }
            System.out.println(n);
        }
    }
}
