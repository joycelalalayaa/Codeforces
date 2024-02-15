import java.util.*;

public class CF877CNoPrimeDifferences {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int column = fs.nextInt();
            int row = fs.nextInt();
            int grid[][] = new int[column][row];
            int i, j = 1;
            int k = column * row;
            for (i = 0; i < column; i++) {
                for (j = 0; j < row; j++) {
                    grid[i][j] = k;
                    // k = k + 4;
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
