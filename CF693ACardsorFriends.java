import java.util.*;

public class CF693ACardsorFriends {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int h = fs.nextInt(), w = fs.nextInt(), numOfCards = fs.nextInt();
            int total = 1;
            if(h % 2 == 1 && w % 2 == 1 && numOfCards == 1){
                System.out.println("YES");
            } else {
                while(h % 2 == 0){
                    total *= 2;
                    h /= 2;
                }
                while(w % 2 == 0){
                    total *= 2;
                    w /= 2;
                }
                if(total >= numOfCards){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
