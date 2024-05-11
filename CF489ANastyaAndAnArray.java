import java.util.*;
public class CF489ANastyaAndAnArray {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt();
        HashSet<Integer> arr = new HashSet();
        for(int i = 0; i < len; i++){
            int thingy = fs.nextInt();
            if (thingy != 0) {
                arr.add(thingy);
            }
        }
        System.out.println(arr.size());

    }
}
