import java.util.Scanner;

public class CF573ATokitsukazeAndEnhancement {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int input = fs.nextInt();
        if(input % 4 == 1){
            System.out.println("0 A");
        } else if (input % 4 == 0){
            System.out.println("1 A");
        } else if(input % 4 == 2){
            System.out.println("1 B");
        } else {
            System.out.println("2 A");
        }
    }
}
