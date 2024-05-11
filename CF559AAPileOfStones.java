import java.util.Scanner;

public class CF559AAPileOfStones {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt();
        char[] arr = fs.next().toCharArray();
        int n = 0, zero = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == '+') {
                n++;
            } else {
                n--;
            }
            n = Math.max(n, zero);
        }
        System.out.println(n >= 0 ? n : 0);
    }
}
