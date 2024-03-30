import java.util.*;

public class CF937A {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int[] arr = new int[3];
            for(int i = 0; i < arr.length; i++){
                arr[i] = fs.nextInt();
            }
            if(arr[1] > arr[0] && arr[1] > arr[2]){
                System.out.println("PEAK");
            } else if(arr[2] > arr[1] && arr[1] > arr[0]){
                System.out.println("STAIR");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
