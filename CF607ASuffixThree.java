import java.util.Scanner;

public class CF607ASuffixThree {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            // System.out.println(input);
            if((char)input.charAt(input.length() - 1) == 'o'){
                System.out.println("FILIPINO");
            } else if((char)input.charAt(input.length() - 1) == 'u'){
                System.out.println("JAPANESE");
            } else{
                System.out.println("KOREAN");
            }
        }
    }
}
