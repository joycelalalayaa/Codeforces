import java.util.*;

public class CF797APrintAPedestal {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int a = (len + 1) / 3, b = a + 1, c = len - a - b;
            if (c == a) {
                System.out.println(a + " " + (b + 1) + " " + (c - 1));
            } else {
                System.out.println(a + " " + b + " " + c);
            }

            // int x = len/3;
            // if (len%3==0) {
            //     System.out.println(x+" "+(x+1)+" "+(x-1));
            // }
            // else if (len%3==1) {
            //     System.out.println(x+" "+(x+2)+" "+(x-1));
            // }
            // else {
            //     System.out.println((x+1)+" "+(x+2)+" "+(x-1));
            // }

        }
    }
}
