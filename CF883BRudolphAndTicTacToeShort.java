import java.util.Arrays;
import java.util.Scanner;

/*
1
OOO
+XO
+X.

1
O++
OX.
OX.

[O,O,O]
XXO
XXO
 */
public class CF883BRudolphAndTicTacToeShort {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int rows = 3;
            int cols = 3;
            char[][] grid = new char[rows][cols];
            for (int r = 0; r < rows; r++) {
                grid[r]=fs.next().toCharArray();
            }
            for (int i=0; i<3; i++) {
                if (over(grid, i, 0, i, 1, i, 2)) {
                    System.out.println(grid[i][0]);
                    continue outer;
                }
                if (over(grid, 0, i, 1, i, 2, i)) {
                    System.out.println(grid[0][i]);
                    continue outer;
                }
            }
            if (over(grid, 0, 0, 1, 1, 2, 2) || over(grid, 2, 0, 1, 1, 0, 2)) {
                System.out.println(grid[1][1]);
                continue outer;
            }

            System.out.println("DRAW");
        }
    }
    static boolean over(char[][] board, int x1, int y1, int x2, int y2, int x3, int y3) {
        if (board[x1][y1]!=board[x2][y2] || board[x2][y2]!=board[x3][y3]|| board[x1][y1]=='.') return false;
        return true;
    }
}
