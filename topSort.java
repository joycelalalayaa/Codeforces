import java.util.*;

public class topSort {
    public static void main(String[] args) {
        String[][] edges = new String[4][2];
        edges[0] = new String[] { "main.cpp", "string.h" };
        edges[1] = new String[] { "string.h", "lib.cpp" };
        edges[2] = new String[] { "main.cpp", "vector.cpp" };
        edges[3] = new String[] { "vector.cpp", "string.h" };
        String[] fileNames = { "main.cpp", "string.h", "lib.cpp", "vector.cpp" };
        System.out.println(getBuildOrder(edges, fileNames));
    }

    public static ArrayList<String> getBuildOrder(String[][] edges, String[] fileNames) {
        HashMap<String, Integer> compress = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < fileNames.length; i++) {
            compress.put(fileNames[i], i);
        }
        ArrayList<Integer>[] adj = new ArrayList[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int fromIndex = compress.get(edges[i][0]);
            int toIndex = compress.get(edges[i][1]);
            adj[fromIndex].add(toIndex);
        }
        int[] indegrees = new int[edges.length];
        for (int i = 0; i < fileNames.length; i++) {
            // for (int j = 0; j < adj[i].size(); j++) {
            // int to = adj[i].get(j);
            // indegrees[to]++;
            // }
            for (int to : adj[i]) {
                indegrees[to]++;
            }
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
                ans.add(fileNames[i]);
            }
        }
        // n
        while (!queue.isEmpty()) {
            int current = queue.removeFirst();
            // m
            for (int i = 0; i < adj[current].size(); i++) {
                int to = adj[current].get(i);
                indegrees[to]--;
                if (indegrees[to] == 0) {
                    // each node gets added to the queue when it's last incoming edge is processed
                    queue.add(to);
                    ans.add(fileNames[to]);
                }
            }
            // for (int to : adj[current]) {
            //     indegrees[to]--;
            //     if (indegrees[to] == 0) {
            //         queue.add(to);
            //         ans.add(fileNames[to]);
            //     }
            // }
        }
        Collections.reverse(ans);

        // ArrayList<String> ans = new ArrayList<>();
        // // mn
        // int[] indegrees = new int[edges.length];
        // for (int i = 0; i < edges.length; i++) {
        // for (int j = 0; j < fileNames.length; j++) {
        // if (edges[i][1] == fileNames[j]) {
        // indegrees[j]++;
        // }
        // }
        // }

        // // n
        // ArrayDeque<String> queue = new ArrayDeque<>();
        // for (int j = 0; j < fileNames.length; j++) {
        // if (indegrees[j] == 0) {
        // queue.add(fileNames[j]);
        // ans.add(fileNames[j]);
        // }
        // }

        // // nmn = mn^2
        // // m
        // while (!queue.isEmpty()) {
        // String current = queue.removeFirst();
        // for (int i = 0; i < edges.length; i++) {
        // for (int j = 0; j < fileNames.length; j++) {
        // if (edges[i][0] == current && edges[i][1] == fileNames[j]) {
        // indegrees[j]--;
        // if (indegrees[j] == 0) {
        // queue.add(fileNames[j]);
        // ans.add(fileNames[j]);
        // }
        // }
        // }
        // }

        // }
        // Collections.reverse(ans);

        return ans;
    }

}
/*
 * compile program
 * main.cpp, string.h, lib.cpp, vector.cpp
 * (main.cpp->string.h)
 * (string.h->lib.cpp)
 * (main.cpp->vector.cpp)
 * (vector.cpp->string.h)
 * 
 * [lib.cpp, string.h, vector.cpp, main.cpp]
 */
