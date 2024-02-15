import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF847BTaisiaAndDice {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int diceNum = fs.nextInt();
            int diceSum = fs.nextInt();
            int oneLessSum = fs.nextInt();
            // ArrayList<Integer> ans = new ArrayList<>();
            // int maxiNum = diceSum - oneLessSum;
            // ans.add(maxiNum);
            // diceNum--;
            // while (diceNum > 0) {
            // int added = oneLessSum / diceNum;
            // ans.add(added);
            // diceNum--;
            // oneLessSum -= added;
            // }
            // for(int i : ans){
            // System.out.print(i + " ");
            // }
            // System.out.println();

            /*
             * 20 strawberries
             * count from 0 to 14 inclusive
             * [5, 2, 2, 1, 1]
             */
            int[] arr = new int[diceNum];
            arr[0] = diceSum - oneLessSum;
            int giveTo = 1;
            for (int i = 0; i < oneLessSum; i++) {
                arr[giveTo]++;
                giveTo++;
                if (giveTo == diceNum) {
                    giveTo = 1;
                }
            }
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/*
 * 5 20 15
 * 5 15/4 = 3..3
 */