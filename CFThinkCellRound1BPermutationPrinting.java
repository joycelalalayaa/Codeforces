import java.util.*;
public class CFThinkCellRound1BPermutationPrinting {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] p = new int[len];

            int left = 0;
            int right = len - 1;
            int smallest = 1;
            int largest = len;

            while (smallest <= largest) {
                if (left <= right) {
                    p[left++] = smallest++;
                }
                if (left <= right) {
                    p[left++] = largest--;
                }
            }


            for (int num : p) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
