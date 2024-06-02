import java.util.*;

public class CF946BSymmetricEncoding {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] a = fs.next().toCharArray();
            TreeSet<Character> r = new TreeSet<>();
            for (int i = 0; i < len; i++) {
                r.add(a[i]);
            }
            ArrayList<Character> arr = new ArrayList<>(r);

            // System.out.println(arr);
            char[] ans = new char[len];
            for (int i = 0; i < len; i++) {
                // for(int j = 0; j < arr.size(); j++){
                    int j = arr.indexOf(a[i]);
                    if(a[i] == arr.get(j)){
                        ans[i] = arr.get(arr.size()-1-j);
                    }
                // }
            }
            for(int i = 0; i < len; i++){
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
