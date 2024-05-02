import java.util.*;

public class CF850A1NonAlternatingDeck {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int sum = fs.nextInt();
            int alice = 0;
            int total = 0;
            for (int i = 1; total < sum; i++) {
                if (i % 4 == 0) {
                    if (sum - total < i) {
                        alice += sum - total;
                    } else {
                        alice += i;
                    }
                }
                if (i % 4 == 1) {
                    if (sum - total < i) {
                        alice += sum - total;
                    } else {
                        alice += i;
                    }
                }
                total += i;
            }
            System.out.println(alice + " " + (sum - alice));
        }
    }

}
