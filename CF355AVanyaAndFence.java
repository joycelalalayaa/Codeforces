import java.util.Arrays;
import java.util.Scanner;

public class CF355AVanyaAndFence {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int totalPeople = fs.nextInt(), fenceHeight = fs.nextInt();
        int[] peopleArr = new int[totalPeople];
        for (int i = 0; i < totalPeople; i++) {
            peopleArr[i] = fs.nextInt();
        }
        // System.out.println(Arrays.toString(peopleArr));
        int ans = 0;
        for (int i = 0; i < totalPeople; i++) {
            if (peopleArr[i] <= fenceHeight) {
                ans++;
            } else {
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}
