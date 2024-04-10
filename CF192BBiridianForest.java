import java.util.*;

public class CF192BBiridianForest {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int row = fs.nextInt(), column = fs.nextInt();
        char[][] grid = new char[row][column];
        for (int r = 0; r < row; r++) {
            grid[r] = fs.next().toCharArray();
        }
        int eRow = 0, eCol = 0;
        int sRow = 0, sCol = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] == 'E') {
                    eRow = r;
                    eCol = c;
                } else if (grid[r][c] == 'S') {
                    sRow = r;
                    sCol = c;
                } else if (grid[r][c] == 'T') {
                } else if (grid[r][c] == '0') {
                }
            }
        }

        int[][] distance = new int[row][column];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                distance[r][c] = 100_000;
            }
        }
        boolean[][] visited = new boolean[row][column];

        ArrayDeque<Integer> rQueue = new ArrayDeque<>();
        ArrayDeque<Integer> cQueue = new ArrayDeque<>();
        rQueue.addLast(eRow);
        cQueue.addLast(eCol);
        distance[eRow][eCol] = 0;
        visited[eRow][eCol] = true;

        while (!rQueue.isEmpty()) {
            int atR = rQueue.removeFirst();
            int atC = cQueue.removeFirst();
            int newR, newC;
            // right
            newR = atR + 1;
            newC = atC;
            if (newR < row && grid[newR][newC] != 'T' && !visited[newR][newC]) {
                rQueue.addLast(newR);
                cQueue.addLast(newC);
                distance[newR][newC] = distance[atR][atC] + 1;
                visited[newR][newC] = true;
            }

            // left
            newR = atR - 1;
            newC = atC;
            if (newR >= 0 && grid[newR][newC] != 'T' && !visited[newR][newC]) {
                rQueue.addLast(newR);
                cQueue.addLast(newC);
                distance[newR][newC] = distance[atR][atC] + 1;
                visited[newR][newC] = true;
            }

            // up
            newR = atR;
            newC = atC - 1;
            if (newC >= 0 && grid[newR][newC] != 'T' && !visited[newR][newC]) {
                rQueue.addLast(newR);
                cQueue.addLast(newC);
                distance[newR][newC] = distance[atR][atC] + 1;
                visited[newR][newC] = true;
            }

            // down
            newR = atR;
            newC = atC + 1;
            if (newC < column && grid[newR][newC] != 'T' && !visited[newR][newC]) {
                rQueue.addLast(newR);
                cQueue.addLast(newC);
                distance[newR][newC] = distance[atR][atC] + 1;
                visited[newR][newC] = true;
            }
        }

        int ans = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] != 'T' && grid[r][c] != 'E' && grid[r][c] != 'S' && grid[r][c] != '0') {
                    if (distance[r][c] <= distance[sRow][sCol]) {
                        ans += (int) grid[r][c] - '0';
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
