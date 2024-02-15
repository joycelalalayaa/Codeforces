import java.util.*;

public class CF878ACipherShifer {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            String s = fs.next();
            StringBuilder decrypted = new StringBuilder();

            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        decrypted.append(s.charAt(i));
                        i = j;
                    }
                }
            }

            System.out.println(decrypted.toString());
        }
    }
}