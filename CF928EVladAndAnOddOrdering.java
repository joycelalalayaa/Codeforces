import java.util.*;

public class CF928EVladAndAnOddOrdering {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int kthNum = fs.nextInt();
            // HashSet<Integer> arr = new HashSet<>();

            // Set<Integer> set = new LinkedHashSet<>();
            // for (int i = 1; i <= len; i += 2) {
            // set.add(i);
            // }
            // System.out.println(set);
            // for (int i = 2; i <= len; i++) {
            // for (int j = i; j <= len; j += i) {
            // set.add(j);
            // }
            // }
            // System.out.println(set);

            if (kthNum <= (len + 1) / 2) {
                System.out.println(kthNum * 2 - 1);
            } else {

            }

        }
    }

}

/*
7
1 3 5 7 2 6 4

11
1 3 5 7 9 11 2 6 10 4 8 

 */
