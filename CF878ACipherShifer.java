import java.util.Scanner;

public class CF878ACipherShifer {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            int i = 0;
            while (i < len) {
                int start = i;
                System.out.print(arr[i++]);
                while (i < len && arr[i] != arr[start]) {
                    i++;
                }
                if (i < len) {
                    i++; 
                }
            }
            System.out.println();
        }
    }
}
