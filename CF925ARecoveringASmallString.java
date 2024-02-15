import java.util.Scanner;

public class CF925ARecoveringASmallString {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] charArr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    for (int k = 0; k < 26; k++) {
                        if (i + 1 + j + 1 + k + 1 == len) {
                            System.out.println(charArr[i] + "" + charArr[j] + "" + charArr[k]);
                            continue outer;
                        }
                    }
                }
            }
            // if(len <= 28){
            //     System.out.println('a' + "" + 'a' + "" + charArr[len-3]);
            // } else if (len > 28 && len <= 52){
            //     System.out.println('a' + "" + charArr[len-26-2] + "" + 'z');
            // } else {
            //     System.out.println(charArr[len-26-26-1] + "" + 'z' + "" + 'z');
            // }
        }
    }
}
