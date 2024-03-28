import java.util.*;

public class EducationalCF132AThreeDoors {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int firstKey = fs.nextInt();
            int[] arr = new int[4];
            // [ 0, 0, 1, 2];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = fs.nextInt();
            }
            // System.out.println(arr[arr[firstKey]]!=0?"YES":"NO");
            // if(arr[firstKey] == 0){
            // System.out.println("NO");
            // } else {
            int secondKey = arr[firstKey];
            if (arr[secondKey] == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            // }
        }
    }
}
