import java.util.HashSet;
import java.util.Scanner;

public class CF923CChooseTheDifferentOnesDavid {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int lenA = fs.nextInt();
            int lenB = fs.nextInt();
            int n = fs.nextInt();

            HashSet<Integer> a = new HashSet<>(), b = new HashSet<>();
            for (int i = 0; i < lenA; i++) {
                int num = fs.nextInt();
                if(num <= n){
                    a.add(num);
                }
            }
            for (int i = 0; i < lenB; i++) {
                int num = fs.nextInt();
                if(num <= n){
                    b.add(num);
                }
            }

            boolean hasAll = true;
            for (int i = 1; i <= n; i++) {
                if (!a.contains(i) && !b.contains(i)) {
                    hasAll = false;
                }
            }

            if (a.size() >= n / 2 && b.size() >= n / 2 && hasAll) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}