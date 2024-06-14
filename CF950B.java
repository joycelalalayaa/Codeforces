import java.util.*;

public class CF950B {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt(), dennysFav = fs.nextInt(), toRemove = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            int dFav = arr[dennysFav - 1]; 
            int[] copySorted = arr.clone();
            Arrays.sort(copySorted);
            int[] reversed = new int[len];
            for (int i = 0; i < len; i++) {
                reversed[i] = copySorted[len-1-i];
            }
            // System.out.println(Arrays.toString(reversed));
            ArrayList<Integer> newFav = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if(reversed[i] == dFav){
                    newFav.add(i+1);
                }
            }
            // System.out.println(newFav);

            if(newFav.get(0) <= toRemove && newFav.get(newFav.size()-1) > toRemove){
                System.out.println("MAYBE");
            } else if(newFav.get(0) > toRemove){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
