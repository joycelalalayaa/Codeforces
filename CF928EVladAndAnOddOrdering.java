import java.util.*;

public class CF928EVladAndAnOddOrdering {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int kthNum = fs.nextInt();
            System.out.println(solve(kthNum, len));
            // int[] powerOfTwo = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,
            //         1024 * 2,
            //         1024 * 4,
            //         1024 * 8,
            //         1024 * 16,
            //         1024 * 32,
            //         1024 * 64,
            //         1024 * 128,
            //         1024 * 256,
            //         1024 * 512,
            //         1024 * 1024,
            //         1024 * 1024 * 2,
            //         1024 * 1024 * 4,
            //         1024 * 1024 * 8,
            //         1024 * 1024 * 16,
            //         1024 * 1024 * 32,
            //         1024 * 1024 * 64,
            //         1024 * 1024 * 128,
            //         1024 * 1024 * 256,
            //         1024 * 1024 * 512
            // };
            // if (kthNum <= (len + 1) / 2) {
            //     System.out.println(kthNum * 2 - 1);
            // } else if (kthNum <= ((len + 1) / 2 +1)/2){
            //     System.out.println();
            // }
        }
    }

    // return the value of the thing at index if there are nCards total
    static int solve(int index, int nCards) {
        // odd
        if (index<=(nCards+1)/2) {
            return index*2-1;
        }
        int nEvenNumbers = nCards/2;
        index-=(nCards+1)/2;
        int redAns=solve(index, nEvenNumbers);
        return redAns*2;
    }

}

/*
 * 7
 * 1 3 5 7
 * 2 6
 * 4
 * 
 * 11
 * 1 3 5 7 9 11
 * 2 6 10
 * 4
 * 8
 * 
 * 22
 * 1 3 5 7 9 11 13 15 17 19 21
 * 2 6 10 14 18
 * 4 12 20
 * 8
 * 16
 * 
 * 
 * 
 */
