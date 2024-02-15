import java.util.Arrays;
import java.util.Scanner;

/*

111000011100

101



 */
public class CF16BMINMEXCut {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] a = fs.next().toCharArray();
            int zeroCount=0, zeroStarts=0;
            for (int i=0; i<a.length; i++) {
                if (a[i]=='0') {
                    zeroCount++;
                    if (i==0 || a[i-1]!='0')
                        zeroStarts++;
                }
            }
            if (zeroCount==0) {
                System.out.println(0);
            }
            else if (zeroStarts==1) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }

            // String input = fs.next();
            // char[] arr = new char[input.length()];
            // for (int i = 0; i < input.length(); i++) {
            //     arr[i] = input.charAt(i);
            // }
            // int oneZeroPair = 0;
            // for(int i = 0; i < arr.length - 1; i++){
            //     if(arr[i] == '1' && arr[i+1] == '0'){
            //         oneZeroPair++;
            //     }
            // }
            // if(arr[0] == '1'){
            //     // 101010101
            //     if(oneZeroPair == 0) {
            //         //1111110
            //         System.out.println(0);
            //     } else if(oneZeroPair == 1){
            //         //11100001111
            //         System.out.println(1);
            //     } else {
            //         System.out.println(2);

            //     }
            // } else {
            //     if(oneZeroPair == 0){
            //         System.out.println(1);
            //     } else {
            //         System.out.println(2);
                    
            //     }
            // }


            // System.out.println(Arrays.toString(arr));
            // System.out.println(zeroCount);
            // System.out.println(oneCount);
        }
    }
}
/*

100 -> 1
0 -> 1

all ones -> 0
all 0s, 111...11000...00, 000..0000011...111 -> 1
both 1 and 0 -> 2

0101
1010

0011110000011111

000011110000
111 000 111

 */
