import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF828BEvenOddIncrements {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int num = fs.nextInt();
            long[] arr = new long[len];
            long[] thing = new long[2 * num];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            for (int i = 0; i < 2 * num; i++) {
                thing[i] = fs.nextInt();
            }
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                if (arr[i] % 2 == 0) {
                    even.add((int) arr[i]);
                } else {
                    odd.add((int) arr[i]);
                }
            }
            long sum = 0;
            for (long i : arr) {
                sum += i;
            }
            
            int evenNum = even.size();
            int oddNum = odd.size();
            for (int i = 0; i < thing.length; i += 2) {
                if (thing[i] == 0) {
                    // System.out.println("real evenNum: " + evenNum);
                    sum += thing[i+1] * evenNum;
                    if(thing[i+1] % 2 != 0){
                        oddNum += evenNum;
                        evenNum = 0;
                    }
                    // System.out.println("EvenNum: "+ evenNum);
                } else {
                    sum += thing[i+1] * oddNum;
                    if(thing[i+1] % 2 != 0){
                        evenNum += oddNum;
                        oddNum = 0;
                    }
                    // System.out.println("2EvenNum: "+ evenNum);
                }
                System.out.println(sum);
            }
        }
    }
}
/*
 * 1 2 4
 * 0 2
 * 1 3
 * 0 5
 * 
 * 1 4 6 
 * 4 4 6
 * 14 + 15
 */