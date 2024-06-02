import java.util.*;

public class chickenNuggests {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = 1009000;
        int[] arr = new int[] { 15, 16 };
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        boolean[] lastAnsForN = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            lastAnsForN[i] = false;
        }
        // int max = 10;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!canBuyNNuggets(i, arr, visited, lastAnsForN)) {
                ans.add(i);
            }
        }
        System.out.println(ans);

    }

    // n = 10
    public static boolean canBuyNNuggets(int n, int[] arr, boolean[] visited, boolean[] lastAnsForN) {
        if(n < 0){
            return false;
        }
        if (visited[n]) {
            return lastAnsForN[n];
        }
        Arrays.sort(arr);
        boolean ans = false;
        if (n == 0) {
            ans = true;
        } else if (n < arr[0]) {
            ans = false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (canBuyNNuggets(n - arr[i], arr, visited, lastAnsForN)) {
                    ans = true;
                } else {
                    continue;
                }
            }
        }
        visited[n] = true;
        lastAnsForN[n] = ans;
        return ans;
    }

}
