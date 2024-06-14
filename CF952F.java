import java.util.*;

public class CF952F {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            long bossHealth = fs.nextLong(); // Health of the boss
            int len = fs.nextInt(); // Number of attacks

            long[] damages = new long[len];
            long[] cooldowns = new long[len];

            for (int i = 0; i < len; i++) {
                damages[i] = fs.nextLong();
            }

            for (int i = 0; i < len; i++) {
                cooldowns[i] = fs.nextInt();
            }

            long min = 0;
            long max = 1000_000_000_000l;
            while (min != max) {
                long mid = (min + max) / 2;
                if (!ifWork(bossHealth, mid, damages, cooldowns)) {
                    min = mid + 1;
                } else {
                    max = mid;
                }
            }

            System.out.println((min + 1));
        }
    }

    static boolean ifWork(long health, long time, long[] damage, long[] cooldowns) {
        long attack = 0;
        for (int i = 0; i < damage.length; i++) {
            attack += damage[i];
        }
        for (int i = 0; i < damage.length; i++) {
            attack += damage[i] * (time / cooldowns[i]);
            if (health <= attack) {
                return true;
            }
            // System.out.println("attack: " + attack + ", i: " + i);
        }
        return false;
    }
}
