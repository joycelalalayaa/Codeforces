import java.util.Scanner;

public class CF447AQAQ {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        String s = fs.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    if (s.charAt(i) == 'Q' && s.charAt(j) == 'A' && s.charAt(k) == 'Q') {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
