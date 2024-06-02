import java.util.Scanner;

public class CF921AWeGotEverythingCovered {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); 
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt(); 

            for (int i = 0; i < n; i++) {
                for (char c = 'a'; c < 'a' + k; c++) {
                    System.out.print(c); 
                }
            }
            System.out.println(); 
        }

        scanner.close();

    }
}
