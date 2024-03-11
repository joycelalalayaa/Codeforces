import java.util.*;

public class CF101AAmusingJoke {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        String s1 = fs.next(), s2 = fs.next(), s3 = fs.next();
        int len1 = s1.length() + s2.length();
        int len2 = s3.length();
        for (int i = 0; i < s1.length(); i++) {
            s3 = s3.replaceFirst(s1.substring(i, i + 1), "");
        }
        for (int i = 0; i < s2.length(); i++) {
            s3 = s3.replaceFirst(s2.substring(i, i + 1), "");
        }
        if (len1 == len2 && s3.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
