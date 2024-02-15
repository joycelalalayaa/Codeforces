import java.util.Scanner;

public class CF900AHowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int wanted = fs.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = fs.nextInt();
            }
            boolean ifFound = false;
            for(int i = 0; i < len; i++){
                if(arr[i] == wanted){
                    ifFound = true;
                } 
            }
            if(ifFound){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
