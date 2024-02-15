import java.util.*;

public class CF891AArrayColoring{
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for(int tc = 0; tc < testcases; tc++){
            int length = fs.nextInt();
            int[] arr = new int[length];
            int sum = 0;
            for(int i = 0; i < length; i++){
                arr[i] = fs.nextInt();
            }
            for(int i = 0; i < length; i++){
                sum += arr[i];
            }
            if(sum % 2 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}