import java.util.*;

/*



 */

public class CF937D {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        ArrayList<Integer> allPos = new ArrayList<>();
        for (int i=1; i<=1<<5; i++) {
            String binary = Integer.toBinaryString(i);
            allPos.add(Integer.parseInt(binary));
        }
        int max=100_001;
        boolean[] hit=new boolean[max];
        ArrayDeque<Integer> bfs=new ArrayDeque<>();
        bfs.add(1);
        while (!bfs.isEmpty()) {
            int at=bfs.remove();
            for (int other:allPos) {
                if (!hit[at*other]) {
                    hit[at*other]=true;
                    bfs.add(at*other);
                }
            }
        }

        for (int tc = 0; tc < testcases; tc++) {
            int number = fs.nextInt();
           
            if (hit[number]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
