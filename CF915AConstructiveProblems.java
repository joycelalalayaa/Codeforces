import java.util.*;


/*
5 7
* * 0 * *
* 0 * * *
* * * 0 *
0 * * * *
* * * * 0
* * 0 * *
* * * * 0
 */
public class CF915AConstructiveProblems {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt(), m = fs.nextInt();
            System.out.println(Math.max(n, m));
        }
    }
}
