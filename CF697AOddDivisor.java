// import java.util.*;

// public class CF697AOddDivisor {
//     public static void main(String[] args) {
//         Scanner fs = new Scanner(System.in);
//         int testcases = fs.nextInt();
//         outer: for (int tc = 0; tc < testcases; tc++) {
//             long input = fs.nextLong();
//             for(long i = 3; i <= input; i+=2){
//                 if(input % i == 0){
//                     System.out.println("YES");
//                     continue outer;
//                 }
//             }
//             System.out.println("NO");
//         }

//     }
// }
import java.util.*;

public class CF697AOddDivisor {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            long input = fs.nextLong();
            // Check if input is a power of 2
            if ((input & (input - 1)) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
