import java.util.Scanner;

public class CF886BTenWordsOfWisdomDavid {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int num = fs.nextInt();
            int bestAns = 0;
            int index = 0;
            for (int n = 0; n < num; n++) {
                int length = fs.nextInt();
                int quality = fs.nextInt();
                if(length <= 10 && bestAns < quality){
                    bestAns = quality;
                    index = n+1;
                }
            }
            System.out.println(index);
        }
    }
}
