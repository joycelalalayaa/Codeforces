import java.util.Scanner;

public class CFHello2024AWalletExchange {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int sum = 0;
            // for(int i = 0; i < 2; i++){
            int first = fs.nextInt();
            int second = fs.nextInt();
            sum = first + second;
            // System.out.println(first + " + " + second);
            if (sum % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
            // }
        }
    }
}
