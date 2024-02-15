import java.util.Scanner;

public class CF795ABeatTheOdds {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            // int sum = 0;
            // for(int i : arr){
            // sum += i;
            // }
            // if(sum % 2 ==0){
            // System.out.println(0);
            // }
            int odd = 0;
            int even = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            // System.out.println("Even: " + even);
            // System.out.println("Odd: " + odd);
            int oddPair = 0;
            for (int i = 0; i < len - 1; i++) {
                if ((arr[i] + arr[i + 1]) % 2 != 0) {
                    oddPair++;
                }
            }
            if(oddPair != 0){
                if(even > odd){
                    System.out.println(odd);
                } else {
                    System.out.println(even);
                }
            } else {
                System.out.println(0);
            }
            // System.out.println(oddPair);
        }
    }
}

/*
22
125 126 145 22 81 97 129 97 52 25 25 82 84 117 56 132 52 28 87 57 39 68

45
29 6 140 18 118 16 140 113 143 99 91 10 105 18 81 30 7 18 34 28 126 5 21 130 22 95 111 117 17 124 141 4 85 34 65 30 21 95 51 102 25 31 2 53 146
 * 
 */