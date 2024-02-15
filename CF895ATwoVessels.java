import java.util.Scanner;

/*

difference is 10

15+9 / 10
24/10 = 2
19+9= 28/10 = 2
20+9 = 29/10 = 2
21+9 = 30/10 = 3 

15 / 10 -> 2

10 -> 1010
20-> 10100
 */

public class CF895ATwoVessels {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int firstVessel = fs.nextInt();
            int secondVessel = fs.nextInt();
            int capacity = fs.nextInt();
            int difference = capacity << 1;
            System.out.println((Math.abs(firstVessel - secondVessel) + difference - 1) / difference);

            if (Math.abs(firstVessel - secondVessel) % (2 * capacity) == 0) {
                System.out.println(Math.abs(firstVessel - secondVessel) / (2 * capacity));
            } else {
                System.out.println(Math.abs(firstVessel - secondVessel) / (2 * capacity) + 1);
            }
        }
    }
}
