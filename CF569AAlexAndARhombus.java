import java.util.*;

public class CF569AAlexAndARhombus {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans += 4 * (i - 1);
        }
        System.out.println(ans);
    }
}
