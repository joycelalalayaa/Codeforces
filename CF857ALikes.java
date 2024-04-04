import java.util.Scanner;

public class CF857ALikes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int likes = 0, dislikes = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x > 0) likes++;
            else dislikes++;
        }
        for (int i = 1; i <= n; i++) {
            if (i <= likes) System.out.print(i + " ");
            else System.out.print((likes * 2 - i) + " ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i <= dislikes * 2) System.out.print(i % 2 + " ");
            else System.out.print((i - dislikes * 2) + " ");
        }
        System.out.println();
    }
}
