import java.util.*;;

public class CFGoodbye2022AKoxiaAndWhiteboards {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len1 = fs.nextInt(), len2 = fs.nextInt();
            int[] arr = new int[len1 + len2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = fs.nextInt();
            }
            int[] arr2 = new int[len1 + len2];
            for (int i = 0; i < arr.length - 1; i++) {
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);

            long ans = 0;
            for (int i = 0; i < len1 - 1; i++) {
                ans += arr2[arr2.length - 1 - i];
            }
            System.out.println(ans + arr[arr.length - 1]);

        }
    }
}
