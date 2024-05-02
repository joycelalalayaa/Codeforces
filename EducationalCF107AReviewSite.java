import java.util.*;

public class EducationalCF107AReviewSite {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int upvotes = 0;
            for (int i = 0; i < len; i++) {
                // int toDetermine = fs.nextInt();
                // upvotes += new int[] {0, 1, 0, 1}[toDetermine];
                upvotes+=fs.nextInt()%2;
                // if(toDetermine == 3 || toDetermine == 1){
                //     upvotes++;
                // }
            }
            System.out.println(upvotes);
        }
    }
}

