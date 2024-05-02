import java.util.*;
public class tree {
    public static void main(String[] args){
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++){
            nodes[i] = new Node(i);
        }
    }
    static class Node {
        int id;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int id){
            this.id = id;
        }
    }
}
