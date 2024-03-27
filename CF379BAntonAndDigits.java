import java.util.*;

public class CF379BAntonAndDigits {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int two = fs.nextInt(), three = fs.nextInt(), five = fs.nextInt(), six = fs.nextInt();
        int min = Math.min(Math.min(two, six), five);
        int ans = min * 256;
        if (two - min > 0 && three > 0) {
            ans += Math.min(two - min, three) * 32;
        }
        System.out.println(ans);

    }
}
