
/*

0000 0
0001 1
0010 2
0011
0100 4

5 ^ 7 = 2

0101
0111
0010

6 ^ 5 = 3
0110
0101
0011

3 ^ 3 = 0
3 ^ 0 = 3
64 ^ 8 = 72
1000000
0001000
1001000

63 10
0111111
0001010
0110101
32+16+4+1
53


8^3

100 ^ <=100  = <127

64 + ...
64+32+16+8+4+2+1=127




 */

/*
And
6 5
0110
0101

0100

100 & <= 100 == 0 ~ 100

11011111101010010
00000000000000010

11110100001001000000
00000000000001000000

                   10

10010
00100 (1<<2)
&
00000 == 0 (this bit (bit 2) is 0)


10010
00010 (1<<1)
&
00010 != 0 (this bit (bit 1) is 1)

00010 not all 0s, so this bit is on


(1 << 1) & 18 == 0?
 */

import java.util.Scanner;

public class CF796ACirnosPerfectBitmasksClassroom {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            // int x = 16;
            int nOnes = 0;
            if (input == 1) {
                System.out.println(3);
            } else if (input % 2 != 0) {
                System.out.println(1);
            } else {
                for (int bit = 0; bit <= 30; bit++) {
                    // instead of a[i] == 1, you do (input & (1<<i)) != 0
                    if ((input & (1 << bit)) != 0) { // just checking "is input[bit] == 1?""
                        // System.out.println(" bit " + bit + " is 1");
                        nOnes++;
                    }
                }
                int index = 0;
                for (int i = 0; i < 31; i++) {
                    // if (a[i] == 1) {
                    if ((input & (1 << i)) != 0) {
                        index = i;
                        break;
                    }
                }


                if (nOnes == 1) {
                    System.out.println(input + 1);
                } else {
                    System.out.println((int)Math.pow(2, index));
                }
                // System.out.println("It has " + nOnes + " ones");
            }
        }

    }
}
