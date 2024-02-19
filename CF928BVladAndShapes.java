import java.util.Scanner;

public class CF928BVladAndShapes {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int gridLen = fs.nextInt();
            int[][] grid = new int[gridLen][gridLen];
            for (int i = 0; i < gridLen; i++) {
                String row = fs.next();
                for (int j = 0; j < gridLen; j++) {
                    grid[i][j] = row.charAt(j) - '0';
                }
            }

            int[] oneCount = new int[gridLen];
            for (int i = 0; i < gridLen; i++) {
                for (int j = 0; j < gridLen; j++) {
                    if (grid[i][j] == 1) {
                        oneCount[i]++;
                    }
                }
            }

            int oneSum = 0;
            for (int i = 0; i < gridLen; i++) {
                oneSum += oneCount[i];
            }

            for (int i = 0; i < gridLen - 1; i++) {
                if(oneCount[i] == oneSum){
                    System.out.println("SQUARE");
                    continue outer;
                }
                if (oneCount[i] != 0 &&  oneCount[i+1] != 0 && oneCount[i] != oneCount[i + 1]) {
                    System.out.println("TRIANGLE");
                    continue outer;
                }
            }
            System.out.println("SQUARE");

        }
    }
}

/*
10
0000000000
0000000000
0000000000
0000000000
1111111110
0111111100
0011111000
0001110000
0000100000
0000000000
 */