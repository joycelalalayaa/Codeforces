import java.util.*;

public class CF473AMahmoudAndEhabAndTheEvenOddGame {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        if(n % 2 == 0){
            System.out.println("Mahmoud");
        } else {
            System.out.println("Ehab");
        }
    }
}