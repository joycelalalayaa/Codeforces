import java.util.Arrays;
import java.util.Scanner;

public class CF570ANearestInterestingNumber {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int input = fs.nextInt();
        while (!ifInteresting(input)) {
            input++;
        }
        System.out.println(input);

    }

    // O(n) / O(n)
    static boolean ifInteresting(int toCheck) {
        String toCheckString = toCheck + "";// n 12345 => "12345"
        int[] numArr = new int[toCheckString.length()]; // n
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = toCheckString.charAt(i) - '0';
        }
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        if (sum % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // david's cleaner version // O(n) / O(n)
    static boolean ifInteresting2(int toCheck) {
        String toCheckString = toCheck + "";
        int sum = 0;
        for (int i = 0; i < toCheckString.length(); i++) {
            sum += toCheckString.charAt(i) - '0';
        }
        return sum % 4 == 0;
    }

    //O(n)/O(1)
    static boolean ifInteresting3(int toCheck) {
        int sum = 0;
        while (toCheck != 0) {
            // 153 % 10 == 3
            sum += toCheck % 10;
            //153/10 => 15
            toCheck /= 10;
        }
        return sum % 4 == 0;
    }
}