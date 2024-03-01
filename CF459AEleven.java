import java.util.*;

public class CF459AEleven {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();

        boolean[] isFibonacci = new boolean[n + 1];
        int a = 1, b = 1;
        while (a <= n) {
            isFibonacci[a] = true;
            int temp = a + b;
            a = b;
            b = temp;
        }

        StringBuilder newName = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (isFibonacci[i]) {
                newName.append("O");
            } else {
                newName.append("o");
            }
        }

        System.out.println(newName);
    }
}
