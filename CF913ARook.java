import java.util.Scanner;

public class CF913ARook {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            int letterPosition = input.charAt(0)-'a';
            int numPosition = input.charAt(1) - '1';
            for (int i = 0; i < 8; i++) {
                if (i != numPosition) {
                    System.out.println((char)('a' + letterPosition) + "" + (i+1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (i != letterPosition) {
                    System.out.println((char)('a' + i) + "" + (numPosition + 1));
                }
            }

            int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
            // char[] charArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
            char[] charArr = "abcdefgh".toCharArray();
            // for (int i = 0; i < intArr.length; i++) {
            //     // if (!(letterPosition + "" + intArr[i]).equals(input)) {
            //     //     System.out.println(letterPosition + "" + intArr[i]);
            //     // }
            //     if (intArr[i] != numPosition) {
            //         System.out.println(letterPosition + "" + intArr[i]);
            //     }
            // }
            // for (int i = 0; i < charArr.length; i++) {
            //     // if (!(charArr[i] + "" + numPosition).equals(input)) {
            //     //     System.out.println(charArr[i] + "" + numPosition);
            //     // }
            //     if (charArr[i] != letterPosition) {
            //         System.out.println(charArr[i] + "" + numPosition);
            //     }
            // }
        }
    }
}
