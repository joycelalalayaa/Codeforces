
/*
(int)Math.pow(2, index);
1 << index

if (a[i] == 1) {
if ((input & (1 << i)) != 0) {
 */

import java.util.Scanner;

public class CF796ACirnosPerfectBitmasksClassroomDavid {
    public static void main(String[] args) {
        // System.out.println(1 << 3);
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            // if (input == 1) {
            //     System.out.println(3);
            // } else if (Integer.bitCount(input) == 1) {
            //     System.out.println(input + 1);
            // } else {
            //     System.out.println(1 << Integer.numberOfTrailingZeros(input));
            // }
            System.out.println(input==1?3:Integer.bitCount(input)==1?input+1:(1<<Integer.numberOfTrailingZeros(input)));
        }
    }
}
