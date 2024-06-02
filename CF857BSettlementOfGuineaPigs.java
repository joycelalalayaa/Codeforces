import java.util.*;

public class CF857BSettlementOfGuineaPigs {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tt = 0; tt < testcases; tt++) {
            int len = fs.nextInt();
            int known = 0;
            int unknown = 0;
            int need = 0;

            for (int i = 0; i < len; i++) {
                int x = fs.nextInt();
                if (x == 1) {
                    ++unknown;
                } else {
                    known += unknown;
                    unknown = 0;
                }
                need = Math.max(need, unknown + (known > 0 ? known / 2 + 1 : 0));
            }

            System.out.println(need);
        }
    }
}
