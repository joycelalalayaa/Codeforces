import java.util.*;

public class CF584APaintTheNumbers {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = fs.nextInt();
        }
        Arrays.sort(arr);

        int ans = 0;
        outer: for(int bigger = 0; bigger < len; bigger++){
            for(int smaller = 0; smaller < bigger; smaller++){
                if(arr[bigger] % arr[smaller] == 0){
                    continue outer;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}
