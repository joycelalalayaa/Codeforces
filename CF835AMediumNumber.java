import java.util.*;
public class CF835AMediumNumber {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++){
                arr[i] = fs.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
