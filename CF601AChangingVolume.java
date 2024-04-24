import java.util.Scanner;

public class CF601AChangingVolume {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int current = fs.nextInt(), desired = fs.nextInt();
            int difference = Math.abs(current - desired);
            int ans = difference / 5; 
            difference %= 5;
            ans += difference / 2;
            difference %= 2;
            ans += difference; 
            System.out.println(ans);
        }
    }
}
