import java.util.*;
public class CFEducationalRound147AMatching {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            int ans = 1;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '?') {
                    ans *= 10;
                    if (i == 0)
                        ans--;
                }
            }
            if (input.charAt(0) == '0')
                ans = 0;
            System.out.println(ans);
        }
    }
}
