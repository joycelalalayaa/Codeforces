import java.util.*;
public class CF758AFindArray {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int n = fs.nextInt();
            for(int i = 0; i < n; i++){
                System.out.print(i+2 + " ");
            }
            System.out.println();
        }
    }
}
