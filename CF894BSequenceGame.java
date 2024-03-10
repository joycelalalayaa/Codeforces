import java.util.*;

public class CF894BSequenceGame {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
                ans.add(arr[i]);
                if (i > 0 && arr[i] < arr[i - 1]) {
                    ans.add(arr[i]);
                }
            }
            System.out.println(ans.size());
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}
