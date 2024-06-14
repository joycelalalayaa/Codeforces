import java.util.*;
public class CF881CSumInBinaryTree {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        
        for (int tc = 0; tc < testcases; tc++) {
            long n = fs.nextLong();
            long s = 0;
            
            while (n >= 1) {
                s += n;
                n /= 2;
            }
            
            System.out.println(s);
        }
    }
}
