import java.util.*;
public class CF929ATurtlePuzzleRearrangeAndNegate {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int sum = 0;
            for(int i = 0; i < len; i++){
                sum += Math.abs(fs.nextInt());
            }
            System.out.println(sum);
        }
    }
}
