import java.util.*;

/*
a = 1; k >= x;
a = 2; k <= x;
k = 3; k != x;
 */
public class CF929ASatisfyingConstraints {
    // public static void main(String[] args) {
    // Scanner fs = new Scanner(System.in);
    // int testcases = fs.nextInt();
    // for (int tt = 0; tt < testcases; tt++) {
    // int singleTestcases = fs.nextInt();
    // ArrayList<Integer> ans = new ArrayList<>();
    // ArrayList<Integer> ones = new ArrayList<>();
    // ArrayList<Integer> twos = new ArrayList<>();
    // ArrayList<Integer> threes = new ArrayList<>();
    // for (int s = 0; s < singleTestcases; s++) {
    // int a = fs.nextInt();
    // int x = fs.nextInt();
    // // System.out.println("a " +a +", x " + x);
    // if (a == 1) {
    // ones.add(x);
    // }
    // if (a == 2) {
    // twos.add(x);
    // }
    // if (a == 3) {
    // threes.add(x);
    // }
    // }
    // Collections.sort(ones);
    // Collections.sort(twos);
    // Collections.sort(threes);

    // for (int i = ones.get(ones.size() - 1); i <= twos.get(0); i++) {
    // ans.add(i);
    // }

    // // i
    // // ans = [1, 2, 3]
    // // threes = [2, 1]
    // // t
    // outer: for (int i = 0; i < ans.size(); i++) {
    // for (int t = 0; t < threes.size(); t++) {
    // if ((int)ans.get(i) == (int)threes.get(t)) {
    // ans.remove(i);
    // i--;
    // continue outer;
    // }
    // }
    // }

    // System.out.println(ones);
    // System.out.println("twos " + twos);
    // System.out.println("threes " + threes);
    // System.out.println(ans.size());
    // }
    // }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tt = 0; tt < testcases; tt++) {
            int singleTestcases = fs.nextInt();
            // ArrayList<Integer> ans = new ArrayList<>();
            int size = 0;
            ArrayList<Integer> ones = new ArrayList<>();
            ArrayList<Integer> twos = new ArrayList<>();
            ArrayList<Integer> threes = new ArrayList<>();
            for (int s = 0; s < singleTestcases; s++) {
                int a = fs.nextInt();
                int x = fs.nextInt();
                // System.out.println("a " +a +", x " + x);
                if (a == 1) {
                    ones.add(x);
                }
                if (a == 2) {
                    twos.add(x);
                }
                if (a == 3) {
                    threes.add(x);
                }
            }
            Collections.sort(ones);
            Collections.sort(twos);
            Collections.sort(threes);

            // for (int i = ones.get(ones.size() - 1); i <= twos.get(0); i++) {
                if((twos.get(0) - ones.get(ones.size() - 1) + 1) < 0){
                    size = 0;
                } else{
                    size = twos.get(0) - ones.get(ones.size() - 1) + 1;
                }
            // size++;
            // }

            // i
            // ans = [1, 2, 3]
            // threes = [2, 1]
            // t

            for (int i = 0; i < threes.size(); i++) {
                if(threes.get(i) >= ones.get(ones.size()-1) && threes.get(i) <= twos.get(0)){
                    size--;
                }
            }

            // System.out.println(ones);
            // System.out.println("twos " + twos);
            // System.out.println("threes " + threes);
            System.out.println(size);
        }
    }
}
