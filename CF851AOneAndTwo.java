import java.util.*;

public class CF851AOneAndTwo {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            int twos = 0;
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] == 2) {
                    twos++;
                }
            }
            int two = 0;
            if (twos == 0) {
                System.out.println(1);
            } else if (twos % 2 == 0) {
                for (int i = 0; i < len; i++) {
                    if (arr[i] == 2) {
                        two++;
                        if (two == twos / 2) {
                            System.out.println(i + 1);
                        }
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}