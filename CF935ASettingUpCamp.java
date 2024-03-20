import java.util.*;

public class CF935ASettingUpCamp {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int introvert = fs.nextInt(), extrovert = fs.nextInt(), universal = fs.nextInt();
            if (extrovert % 3 != 0 && universal < (3 - extrovert % 3)) {
                System.out.println(-1);
            } else {
                System.out.println(introvert + (extrovert + universal + 2) / 3);
            }
        }
    }
}
