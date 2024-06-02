import java.util.*;
public class CF215ASerejaAndCoatRack {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt(), penalty = fs.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = fs.nextInt();
        }
        int guests = fs.nextInt();
        int ans = 0;
        Arrays.sort(arr);;
        if(guests > len){
            for(int i = 0; i < len; i++){
                ans += arr[i];
            }
            System.out.println(ans - (guests - len) * penalty);
        } else {
            for(int i = 0; i < guests; i++){
                ans += arr[i];
            }
            System.out.println(ans);
        }
    }
}
