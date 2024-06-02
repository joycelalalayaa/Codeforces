import java.util.*;

public class CF946CBeautifulTriplePairs {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            ArrayList<String> triplets = new ArrayList<>();
            for (int i = 0; i < len-2; i++) {
                triplets.add(arr[i] + "," + arr[i+1] + "," + arr[i+2]);
            }

            // System.out.println(triplets);
            int ans = 0;
            for (int i = 0; i < triplets.size(); i++) {
                for (int k = i + 1; k < triplets.size(); k++) {
                    String[] split1 = triplets.get(i).split(",");
                    String[] split2 = triplets.get(k).split(",");
                    int num = 0;
                    for (int j = 0; j < 3; j++) {
                        if (split1[j].equals(split2[j])) {
                            num++;
                        }
                    }
                    if (num == 2) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
