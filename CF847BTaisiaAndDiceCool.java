import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF847BTaisiaAndDiceCool {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int diceNum = fs.nextInt();
            int diceSum = fs.nextInt();
            int oneLessSum = fs.nextInt();

            // int[] arr = new int[diceNum];
            // arr[diceNum-1] = diceSum - oneLessSum;
            // for (int i = 0; i < oneLessSum; i++) {
            //     arr[i%(diceNum-1)]++;
            // }
            // for(int i : arr){
            //     System.out.print(i + " ");
            // }

            System.out.print(diceSum-oneLessSum+" ");
            for (int i=0; i<diceNum-1; i++)
                if (i<oneLessSum%(diceNum-1))
                    System.out.print(oneLessSum/(diceNum-1)+1+" ");
                else
                    System.out.print(oneLessSum/(diceNum-1)+" ");
            System.out.println();
        }
    }
}
/*
 * 5 20 15
 * 5 15/4 = 3..3
 */