import java.util.*;

public class CF806BICPCBalloons {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            // int len = fs.nextInt();
            // char[] alph = fs.next().toCharArray();
            // Arrays.sort(alph);
            // int ans = 2;
            // for(int i = 0; i < len-1; i++){
            //     if(alph[i] == alph[i+1]){
            //         ans++;
            //     } else {
            //         ans+=2;
            //     }
            // }
            // System.out.println(ans);
            int len = fs.nextInt();
            char[] alph = fs.next().toCharArray();
            HashSet<Character> dup = new HashSet<>();
            for(char c : alph){
                dup.add(c);
            }
            System.out.println(len + dup.size());
        }
    }
}
