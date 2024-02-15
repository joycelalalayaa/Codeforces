import java.util.Scanner;

public class CFHello2024BPlusMinusSplit {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int length = fs.nextInt();
            String s = fs.next();
            int plus = 0;
            int minus = 0;
            for (char c : s.toCharArray()) {
                if(c == '+'){
                    plus++;
                }
                if(c == '-'){
                    minus++;
                }
            }
            if(minus > plus){
                System.out.println(minus - plus);
            } else if(minus < plus) {
                System.out.println(plus - minus);
            } else {
                System.out.println(0);
            }
        }
    }
}
