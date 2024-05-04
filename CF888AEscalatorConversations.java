import java.util.Scanner;

public class CF888AEscalatorConversations {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int nOfPeople = fs.nextInt(), nOfStairs = fs.nextInt(), stepHeight = fs.nextInt(),
                    vladHeight = fs.nextInt(), ans=0;
            for (int i = 0; i < nOfPeople; i++) {
                int guy  = fs.nextInt();
                // they can't be on the same step
                // height difference has to be a multiple of the step height
                // there are enough stairs
                if (vladHeight != guy && Math.abs(vladHeight - guy) % stepHeight == 0
                        && Math.abs(vladHeight - guy) <= (nOfStairs - 1) * stepHeight) {
                    ans++;
                }
            }
            System.out.println(ans);

        }
    }
}
/*
 * Vlad: H tall
 * Vlad: 11, 11+3 = 14
 * guy: 3*5 = 15
 * height difference = 14-5 = 9,
 * stair difference = 9;
 * 
 * 33
 * 28
 * height difference = 14-11 = 3,
 * stair difference = 3;
 * 
 * 
 */