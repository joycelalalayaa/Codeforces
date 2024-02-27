import java.util.*;;
public class CF824AWorkingWeek {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int days = fs.nextInt();
            System.out.println((days-3) / 3 - 1);
        }
    }
}
/*
6 0
7 0
8 0
9 1
10 1
11 1
12 2
13 2
14 2

 */