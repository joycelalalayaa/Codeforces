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

OOO
XXO
XXO
 */
public class CF883BRudolphAndTicTacToe {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int rows = 3;
            int cols = 3;
            char[][] grid = new char[rows][cols];
            for (int r = 0; r < rows; r++) {
                String line = fs.next();
                for (int c = 0; c < cols; c++) {
                    grid[r][c] = line.charAt(c);
                }
            }
            // for (int r = 0; r < rows; r++) {
            // for (int c = 0; c < cols; c++) {
            // System.out.println(grid[r][c] + " ");
            // }
            // System.out.println();
            // }
            for (int r = 0; r < rows; r++) {
                if (grid[r][0] == 'O' && grid[r][1] == 'O' && grid[r][2] == 'O') {
                    System.out.println("O");
                    continue outer;
                }
                if (grid[0][r] == 'O' && grid[1][r] == 'O' && grid[2][r] == 'O') {
                    System.out.println("O");
                    continue outer;
                }
                if (grid[r][0] == 'X' && grid[r][1] == 'X' && grid[r][2] == 'X') {
                    System.out.println("X");
                    continue outer;
                }
                if (grid[0][r] == 'X' && grid[1][r] == 'X' && grid[2][r] == 'X') {
                    System.out.println("X");
                    continue outer;
                }
                if (grid[r][0] == '+' && grid[r][1] == '+' && grid[r][2] == '+') {
                    System.out.println("+");
                    continue outer;
                }
                if (grid[0][r] == '+' && grid[1][r] == '+' && grid[2][r] == '+') {
                    System.out.println("+");
                    continue outer;
                }
            }
            if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') {
                System.out.println("O");
                continue outer;
            }
            if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') {
                System.out.println("O");
                continue outer;
            }
            if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') {
                System.out.println("X");
                continue outer;
            }
            if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') {
                System.out.println("X");
                continue outer;
            }
            if (grid[0][0] == '+' && grid[1][1] == '+' && grid[2][2] == '+') {
                System.out.println("+");
                continue outer;
            }
            if (grid[0][2] == '+' && grid[1][1] == '+' && grid[2][0] == '+') {
                System.out.println("+");
                continue outer;
            }

            System.out.println("DRAW");

            // int[] firstRow = new int[3];
            // int[] secondRow = new int[3];
            // int[] thirdRow = new int[3];
            // for(int i = 0; i < firstRow.length; i++){
            // firstRow[i] = fs.nextInt();
            // }
            // for(int i = 0; i < secondRow.length; i++){
            // secondRow[i] = fs.nextInt();
            // }
            // for(int i = 0; i < thirdRow.length; i++){
            // thirdRow[i] = fs.nextInt();
            // }
            // System.out.println(Arrays.toString(firstRow));
        }
    }
}
