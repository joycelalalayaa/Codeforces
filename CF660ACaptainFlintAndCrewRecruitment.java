import java.util.*;
public class CF660ACaptainFlintAndCrewRecruitment {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int num = fs.nextInt();
            if (num <= 30) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (num == 36 || num == 40 || num == 44) {
                    System.out.println(6 + " " + 10 + " " + 15 + " " + (num - 31));
                } else {
                    System.out.println(6 + " " + 10 + " " + 14 + " " + (num - 30));
                }
            }

        }
    }
}
