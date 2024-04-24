import java.util.*;

public class EducationalCFBMinority {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] arr = fs.next().toCharArray();
            int zero = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '0') {
                    zero++;
                }
            }
            int lenDivTwo = (arr.length - 1) / 2;

            System.out.println(Math.min(Math.min(lenDivTwo, zero), arr.length-zero));
        }
    }
}
