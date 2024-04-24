import java.util.*;
public class CFGlobalRoundBILoveAAAB {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] arr = fs.next().toCharArray();
            int thing = 0;
            boolean working = true;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 'A'){
                    thing++;
                } else {
                    thing--;
                }
                if(thing < 0 || arr[arr.length - 1] != 'B'){
                    working = false;
                }
            }
            System.out.println(working ? "YES" : "NO");
        }
    }
}
