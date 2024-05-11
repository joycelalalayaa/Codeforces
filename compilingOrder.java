import java.util.*;

public class compilingOrder {
    public static void main(String[] args) {
        String[][] edges = new String[5][2];
        edges[0] = new String[] {
                "Solution.java",
                "Scanner.java"
        };
        edges[1] = new String[] {
                "Solution.java",
                "ArrayList.java"
        };
        edges[2] = new String[] {
                "ArrayList.java",
                "Array.java"
        };
        edges[3] = new String[] {
                "Solution.java",
                "Array.java"
        };
        edges[4] = new String[] {
                "Scanner.java",
                "Array.java"
        };
        String[] fileNames = new String[4];
        fileNames[0] = "Solution.java";
        fileNames[1] = "Scanner.java";
        fileNames[2] = "ArrayList.java";
        fileNames[3] = "Array.java";

        System.out.println(compileOrder(edges, fileNames));
    }

    public static ArrayList<String> compileOrder(String[][] edges, String[] fileNames) {
        int[] indegree = new int[fileNames.length];
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < fileNames.length; j++) {
                if (edges[i][1] == fileNames[j]) {
                    indegree[j]++;
                }
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        // for(int i = 0; i < indegree.length; i++){
        // System.out.println(fileNames[i] + ": " + indegree[i]);
        // }
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int j = 0; j < fileNames.length; j++) {
            if (indegree[j] == 0) {
                queue.add(fileNames[j]);
                ans.add(fileNames[j]);
            }
        }

        while (!queue.isEmpty()) {
            String processing = queue.removeFirst();
            for (int i = 0; i < edges.length; i++) {
                for (int j = 0; j < fileNames.length; j++) {
                    if (edges[i][0] == processing && edges[i][1] == fileNames[j]) {
                        indegree[j]--;
                        if(indegree[j] == 0){
                            queue.add(fileNames[j]);
                            ans.add(fileNames[j]);
                        }
                    }
                }
            }
        }
        // for (int i = 0; i < indegree.length; i++) {
        //     System.out.println(fileNames[i] + ": " + indegree[i]);
        // }
        
        return ans;

    }
}
