import java.util.Scanner;

public class CF611AAMinutesBeforeTheNewYear {
     public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int hour = fs.nextInt(), minute = fs.nextInt();
            System.out.println((24-hour-1) * 60 + (60-minute));
        }
    }
}
