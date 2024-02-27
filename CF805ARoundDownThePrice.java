import java.util.*;;

public class CF805ARoundDownThePrice {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int num = fs.nextInt();
            int[] arr = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
            for(int i = 0; i < arr.length - 1; i++){
                if(num > arr[i] && num < arr[i+1]){
                    System.out.println(num - arr[i]);
                    continue outer;
                } 
            }
            System.out.println(0);

            // dumb solution
            // if (num < 10) {
            //     System.out.println(num - 1);
            // } else if (num > 10 && num < 100) {
            //     System.out.println(num - 10);
            // } else if (num > 100 && num < 1000) {
            //     System.out.println(num - 100);
            // } else if (num > 1000 && num < 10000) {
            //     System.out.println(num - 1000);
            // } else if (num > 10000 && num < 100000) {
            //     System.out.println(num - 10000);
            // } else if (num > 100000 && num < 1000000) {
            //     System.out.println(num - 100000);
            // } else if (num > 1000000 && num < 10000000) {
            //     System.out.println(num - 1000000);
            // } else if (num > 10000000 && num < 100000000) {
            //     System.out.println(num - 10000000);
            // } else if (num > 100000000 && num < 1000000000) {
            //     System.out.println(num - 100000000);
            // } else {
            //     System.out.println(0);
            // }
        }
    }
}
