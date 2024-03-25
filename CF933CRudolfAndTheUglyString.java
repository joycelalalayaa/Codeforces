import java.util.*;

public class CF933CRudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            int ans = 0;
            int ans2 = 0;
            for(int i = 0; i < arr.length-4; i++){
                if(arr[i] == 'm' && arr[i+1] == 'a' && arr[i+2] == 'p' && arr[i+3] == 'i' && arr[i+4] == 'e'){
                    ans++;
                }
            }
            for(int i = 0; i < arr.length-2; i++){
                if(arr[i] == 'm' && arr[i+1] == 'a' && arr[i+2] == 'p'){
                    ans2++;
                }
            }
            for(int i = 0; i < arr.length-2; i++){
                if(arr[i] == 'p' && arr[i+1] == 'i' && arr[i+2] == 'e'){
                    ans2++;
                }
            }
            System.out.println(ans2 - ans);
        }
    }
}