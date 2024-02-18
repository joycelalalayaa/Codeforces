import java.util.*;

public class CF786BDictionary {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            char first = input.charAt(0);
            char second = input.charAt(1);
            if(second > first){
                System.out.println((first - 'a') * 25 + second - 'a');
            } else {
                System.out.println((first - 'a') * 25 + second - 'a' + 1);

            }
            // System.out.println(second - 'a');

        }
    }
}
