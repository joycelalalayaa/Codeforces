import java.util.*;

public class bartholomewBear {
    public static void main(String[] args) {
        int size = 200;
        int[] visited = new int[size];
        Arrays.fill(visited, -1);
        // Scanner fs = new Scanner(System.in);
        System.out.println(maxFish(0, new int[size], visited));
    }

    public static int maxFish(int cur, int[] fish, int[] visited) {
        int ans = 0;
        if (cur >= fish.length) {
            return 0;
        }
        if (visited[cur] != -1) {
            return visited[cur];
        }
        int takeFish = fish[cur] + (cur + 3 < fish.length ? maxFish(cur + 3, fish, visited) : 0);

        int skipFish = maxFish(cur + 1, fish, visited);
        ans = Math.max(takeFish, skipFish);
        visited[cur] = ans;
        return ans;

    }
}
