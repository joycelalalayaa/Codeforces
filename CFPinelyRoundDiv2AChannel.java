import java.util.*;

public class CFPinelyRoundDiv2AChannel {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int subscriber = fs.nextInt(), nOnline = fs.nextInt(), message = fs.nextInt();
            fs.nextLine();
            String marks = fs.nextLine();
            int countPlus = 0, countMinus = 0, peopleOnlineNow = nOnline;
            for (int c = 0; c < message; c++) {
                char ch = marks.charAt(c);
                if (ch == '+') {
                    countPlus++;
                    peopleOnlineNow++;
                    if (peopleOnlineNow == subscriber) {
                        System.out.println("YES");
                        continue outer;
                    }
                } else {
                    countMinus++;
                    peopleOnlineNow--;
                }
            }
            // System.out.println("nOnline: " + nOnline + ", countPlues: " + countPlus + ", countMinus: " + countMinus);
            if (nOnline == subscriber) {
                System.out.println("YES");
            } else if (nOnline + countPlus - countMinus >= subscriber) {
                System.out.println("YES");
            } else if (nOnline + countPlus >= subscriber) {
                System.out.println("MAYBE");
            } else {
                System.out.println("NO");

            }
        }
    }
}
