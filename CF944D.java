import java.util.*;

/*
101
100

 */
public class CF944D {
    // public static void main(String[] args) {
    //     Scanner fs = new Scanner(System.in);
    //     int testcases = fs.nextInt();
    //     for (int tc = 0; tc < testcases; tc++) {
    //         String s = fs.next();
    //         int piece = 1, zero1 = 0;
    //         for (int i = 1; i < s.length(); i++) {
    //             if (s.charAt(i - 1) == '1' && s.charAt(i) == '0') {
    //                 piece++;
    //             }
    //             if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
    //                 zero1++;
    //             }
    //         }
    //         System.out.println(Math.max(piece, piece + zero1 - 1));
    //     }
    // }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String s = fs.next();
            int ans=1;
            for (int i=1; i<s.length(); i++) if (s.charAt(i)!=s.charAt(i-1)) ans++;
            if (s.contains("01")) ans--;
            System.out.println(ans);
        }
    }
}
/*
 * 1
 * 11010
 * 
 * 101010
 * 100011
 * 
 * 100110
 * 101100
 * 
 * 110001
 * 110010
 * 
 * 110100
 * 111000
 * 
 * 010101
 * 000111
 * 
 * 010011
 * 011001
 * 
 * 010110
 * 001110
 * 
001011
011100
 * 
 * 
 * 1010
 * 
 * 101010
 * 10s
 * keep at most 1 01s
 * 
 */