import java.util.*;

public class CF937B {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            char[][] grid = new char[2 * n][2 * n];
            for (int i = 0; i < 2 * n; i += 2) {
                for (int j = 0; j < 2 * n; j += 2) {
                    char fillChar;
                    if ((i / 2 + j / 2) % 2 == 0) {
                        fillChar = '#';
                    } else {
                        fillChar = '.';
                    }
                    grid[i][j] = fillChar;
                    grid[i][j + 1] = fillChar;
                    grid[i + 1][j] = fillChar;
                    grid[i + 1][j + 1] = fillChar;
                }
            }

            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
}
