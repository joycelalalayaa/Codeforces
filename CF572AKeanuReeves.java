import java.util.*;;

public class CF572AKeanuReeves {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt();
        String input = fs.next();
        int zeros = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == '0') {
                zeros++;
            } 
        }
        if (zeros * 2 != len) {
            System.out.println(1);
            System.out.println(input);
        } else {
            System.out.println(2);
            System.out.println(input.charAt(0) + " " + input.substring(1, len));
        }

    }
}
