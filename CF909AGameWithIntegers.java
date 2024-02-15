import java.util.Scanner;

public class CF909AGameWithIntegers {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            if(input % 3 == 0){
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
