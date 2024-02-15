import java.util.Scanner;

public class CFHello2024BPlusMinusSplitFaster {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            fs.nextInt();
            String s = fs.next();
            int total = 0;
            for (char c : s.toCharArray())
                total += c == '+' ? 1 : -1;
            System.out.println(Math.abs(total));
        }
    }
}
