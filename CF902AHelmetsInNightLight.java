import java.util.*;

public class CF902AHelmetsInNightLight {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            long PakCost = fs.nextLong();
            int[] arr1 = new int[len];
            for (int i = 0; i < len; i++) {
                arr1[i] = fs.nextInt();
            }
            int[] arr2 = new int[len];
            for (int i = 0; i < len; i++) {
                arr2[i] = fs.nextInt();
            }

            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                list.add(new Pair(arr2[i], arr1[i]));
            }

            Collections.sort(list);

            long ans = PakCost;
            long people = len - 1;
            for (Pair pair : list) {
                if(pair.cost >= PakCost){
                    break;
                }
                long numberUses = Math.min(pair.numberUses, people);
                people -= numberUses;
                ans += numberUses * pair.cost;
            }
            ans += people * PakCost;
            System.out.println(ans);
        }
    }

    static class Pair implements Comparable<Pair> {
        int cost, numberUses;

        public Pair(int cost, int numberUses) {
            this.cost = cost;
            this.numberUses = numberUses;
        }

        public int compareTo(Pair o) {
            return Integer.compare(cost, o.cost);
        }

    }
}
