import java.util.*;
public class EducationalCF166BIncreaseDecreaseCopy {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] a = new int[len];
            int[] b = new int[len+1];
            for(int i = 0; i < len; i++){
                a[i] = fs.nextInt();
            }
            for(int i = 0; i < len+1; i++){
                b[i] = fs.nextInt();
            }
            long ans = 0;
            int lastDigit = Integer.MAX_VALUE;
            for(int i = 0; i < len; i++){
                if(a[i] >= b[len] && b[i] <= b[len] || a[i] <= b[len] && b[i] >= b[len]){
                    lastDigit = 0;
                }
                lastDigit = Math.min(lastDigit, Math.min(Math.abs(a[i] - b[len]), Math.abs(b[i] - b[len])));
                ans += Math.abs(a[i] - b[i]);
            }
            
            System.out.println(ans + lastDigit + 1);
        }
    }
}
