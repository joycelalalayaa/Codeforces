import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF867BKarinaAndArray {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                arr.add(fs.nextInt());
            }
            Collections.sort(arr);
            System.out.println(
                    Math.max((long) arr.get(0) * (long) arr.get(1), (long) arr.get(len - 1) * (long) arr.get(len - 2)));
        }
    }
}
// ArrayList<Integer> pos = new ArrayList<>();
// ArrayList<Integer> neg = new ArrayList<>();
// for (int i = 0; i < len; i++) {
// if (arr[i] >= 0) {
// pos.add(arr[i]);
// } else {
// neg.add(arr[i]);
// }
// }
// Collections.sort(pos);
// Collections.sort(neg);
// // long ans = 0;
// if (len == 2) {
// System.out.println((long)arr[0] * (long)arr[1]);
// } else {
// long posToge = 0;
// if (pos.size() >= 2) {
// posToge = (long) pos.get(pos.size() - 1) * (long) pos.get(pos.size() - 2);
// }
// long negToge = 0;
// if (neg.size() >= 2) {
// negToge = (long) neg.get(0) * (long) neg.get(1);
// }
// System.out.println(Math.max(posToge, negToge));
// }
