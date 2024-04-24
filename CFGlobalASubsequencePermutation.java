import java.util.*;

public class CFGlobalASubsequencePermutation {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            char[] sorted = arr.clone();
            Arrays.sort(sorted);
            int needSort = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != sorted[i]){
                    needSort++;
                }
            }
            System.out.println(needSort);
        }
    }
}
