import java.util.*;

public class Educational135AColoredBallsRevisited {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();  
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();  
            int[] arr = new int[len];

            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();  
            }

            int maxIndex = 0;  
            for (int i = 1; i < len; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i; 
                }
            }

            System.out.println(maxIndex + 1); 
        }
    }
}
