import java.util.*;
import java.util.regex.*;

public class CF855AIsItACat {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            String input = fs.next().toLowerCase();
            Pattern p = Pattern.compile("m+e+o+w+");
            Matcher m = p.matcher(input);
            System.out.println(m.matches()?"YES":"NO");
        }

    }

}
