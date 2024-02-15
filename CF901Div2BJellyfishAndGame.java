import java.util.*;

/*

1
2 2 2
1000 1
3 2

Joyce
1000 3

David
1 2

1 3
1000 2


Alice
2 2 2 2 2 2
Bob
1 1 1 1 1 1
 */
public class CF901Div2BJellyfishAndGame {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int jLength = fs.nextInt();
            int gLength = fs.nextInt();
            int rounds = fs.nextInt();
            int[] jellyfish = new int[jLength];
            int[] gellyfish = new int[gLength];
            for (int j = 0; j < jLength; j++) {
                jellyfish[j] = fs.nextInt();
            }
            Arrays.sort(jellyfish);
            for (int g = 0; g < gLength; g++) {
                gellyfish[g] = fs.nextInt();
            }
            Arrays.sort(gellyfish);

            int jSum = 0;
            for (int num : jellyfish) {
                jSum += num;
            }

            if (rounds % 2 == 0) {
                if (gellyfish[0] < jellyfish[jLength - 1]) {
                    System.out.println(jSum - jellyfish[jLength - 1] + gellyfish[0]);
                } else {
                    System.out.println(jSum);

                }

            } else {
                if (gellyfish[gLength - 1] > jellyfish[0]) {
                    System.out.println(jSum - jellyfish[0] + gellyfish[gLength - 1]);
                } else {
                    System.out.println(jSum);
                }
            }
        }
    }
}