import java.util.Scanner;

public class CF150AGamewithBoard {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int length = fs.nextInt();
            if(length > 4){
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
