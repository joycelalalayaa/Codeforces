import java.util.Scanner;

public class CF734APolycarpAndCoins {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            if (input % 3 == 0) {
                System.out.println(input / 3 + " " + input / 3);
            } else if (input % 3 == 1) {
                System.out.println((input / 3 + 1) + " " + input / 3);
            } else {
                System.out.println(input / 3 + " " + (input / 3 + 1));
            }
        }
    }
}
