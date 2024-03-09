import java.util.*;
public class CF680AArrayRearrangment {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt(), wantedSum = fs.nextInt();
            int[] arr1 = new int[len];
            int[] arr2 = new int[len];
            for(int i = 0; i < len; i++){
                arr1[i] = fs.nextInt();
            }
            for(int i = 0; i < len; i++){
                arr2[i] = fs.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean printed = false;
            for(int i = 0; i < len; i++){
                if(arr1[i] + arr2[len-1-i] > wantedSum){
                    System.out.println("NO");
                    printed = true;
                    continue outer;
                }
            }
            if(!printed){
                System.out.println("YES");
            }
        }
    }
}
