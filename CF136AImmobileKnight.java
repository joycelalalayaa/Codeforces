import java.util.Scanner;

public class CF136AImmobileKnight {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int row = fs.nextInt(), col = fs.nextInt();
            System.out.println(((row + 1) >> 1) + " " + ((col + 1) >> 1));

        }
    }
}
/*
 * 1 2 3 4 5 6 7 8
 * 1
 * 2 k
 * 3 k
 * 4
 * 5
 * 6
 * 7
 * 8
 * 
 * 3 6
 * 6 3
 * 4 2
 * 8 8
 * 3 3
 * 7 2
 * 1 3
 * 6 6
 * 
 * 2 4
 * 4 2
 * 3 2
 * 5 5
 * 2 2
 * 4 2
 * 1 2
 * 4 4
 * 1 2 3
 * 1
 * 2
 * 3
 * 
 * 1 2
 * 1
 * 2
 * 3
 * 4 X
 * 5
 * 6
 * 7
 * 
 * 1 2 3
 * 1
 * 2
 * 
 * 1 2 3 4
 * 1
 * 2 X
 * 
 */
