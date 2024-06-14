import java.util.*;

public class VKCup2012Rouns2AChores {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        // int testcases = fs.nextInt();
        // for (int tc = 0; tc < testcases; tc++) {
        int len = fs.nextInt(), olderBro = fs.nextInt(), youngerBro = fs.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            arr.add(fs.nextInt());
        }
        Collections.sort(arr);
        int oldBroSmallest = arr.get(len - olderBro), youngerBroBiggest = arr.get(youngerBro - 1);
        System.out.println(oldBroSmallest - youngerBroBiggest);
        // }
    }
}
