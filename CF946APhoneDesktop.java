import java.util.*;

public class CF946APhoneDesktop {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int mini = fs.nextInt(), twoByTwo = fs.nextInt();
            int screenNeeded = (twoByTwo + 1) / 2;
            if (mini <= 15 * screenNeeded - twoByTwo * 4) {
                System.out.println(screenNeeded);
            } else {
                System.out.println((mini - (15 * screenNeeded - twoByTwo * 4) + 14) / 15 + screenNeeded);
            }

        }
    }
}
