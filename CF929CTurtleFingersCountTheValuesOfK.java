import java.util.*;

public class CF929CTurtleFingersCountTheValuesOfK {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int a = fs.nextInt(), b = fs.nextInt(), l = fs.nextInt();
            HashSet<Integer> ans = new HashSet<>();
            for (int aVal = 1; aVal <= l; aVal *= a) {
                for (int bVal = 1; bVal <= l; bVal *= b) {
                    if (l % aVal == 0 && l / aVal % bVal == 0) {

                        int k = l / aVal / bVal;
                        ans.add(k);
                    }
                }
            }
            System.out.println(ans.size());
        }
    }
}