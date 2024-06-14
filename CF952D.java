import java.util.*;

public class CF952D {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            fs.nextLine(); 

            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = fs.nextLine().toCharArray();
            }

            long sumX = 0;
            long sumY = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '#') {
                        sumX += i + 1;
                        sumY += j + 1;
                        count++;
                    }
                }
            }

            long centerX = sumX / count;
            long centerY = sumY / count;

            System.out.println(centerX + " " + centerY);
        }
    }
}
