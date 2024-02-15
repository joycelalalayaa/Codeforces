import java.util.Arrays;
import java.util.Scanner;

public class CF110AGameOutcomeDavid {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);

        int len = fs.nextInt();
        int[][] grid = new int[len][len];
        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                grid[row][col] = fs.nextInt();
            }
        }
        int[] rowSum = new int[len];
        int[] colSum = new int[len];
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                rowSum[r] += grid[r][c];
                colSum[c] += grid[r][c];
            }
        }
        int ans = 0;
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                if (colSum[c] > rowSum[r]) {
                    ans++;
                }
            }
        }
        // System.out.println(ans);


        System.out.println(Arrays.toString(rowSum));
        
        // int[][] rGrid = new int[len][len];

        // for (int r = 0; r < len; r++) {
        //     int sum = 0;
        //     for (int c = 0; c < len; c++) {
        //         sum += grid[r][c];
        //     }
        //     for (int c = 0; c < len; c++) {
        //         rGrid[r][c] = sum;
        //     }
        // }

        // int[][] cGrid = new int[len][len];
        // for (int c = 0; c < len; c++) {
        //     int sum = 0;
        //     for (int r = 0; r < len; r++) {
        //         sum += grid[r][c];
        //     }
        //     for (int r = 0; r < len; r++) {
        //         cGrid[r][c] = sum;
        //     }
        // }

        // int count = 0;
        // for (int row = 0; row < len; row++) {
        //     for (int col = 0; col < len; col++) {
        //         if (cGrid[row][col] > rGrid[row][col]) {
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);

        // System.out.println("printing c=rGrid");
        // for (int row = 0; row < len; row++) {
        // for (int col = 0; col < len; col++) {
        // System.out.print(rGrid[row][col] + " ");
        // }
        // System.out.println();
        // }

        // System.out.println("printing cGrid");
        // for (int row = 0; row < len; row++) {
        // for (int col = 0; col < len; col++) {
        // System.out.print(cGrid[row][col] + " ");
        // }
        // System.out.println();
        // }

    }
}

/*
 * 
 * 1 2
 * 3 4
 * 
 * 4 6
 * 4 6
 * 
 */
