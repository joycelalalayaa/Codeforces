import java.util.*;

public class AprilFoolsDayContestBIsItStated {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] arr = fs.next().toCharArray();
            boolean ifYes = false;
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] == 'i' && arr[i+1] == 't'){
                    ifYes = true;
                } 
            }
            if(ifYes){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
