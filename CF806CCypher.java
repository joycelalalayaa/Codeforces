import java.util.ArrayList;
import java.util.Scanner;

/*
down: 9 0 1 2 3 4 5 6 7 8

up: 9 8 7 6 5 4 3 2 1 0

0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 

 */

public class CF806CCypher {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {

            int nLines = fs.nextInt();
            int[] digits = new int[nLines];
            for (int j = 0; j < nLines; j++) {
                digits[j] = fs.nextInt();
            }
            fs.nextLine();

            int index;
            ArrayList<Integer> ansArr = new ArrayList<>();
            for (int j = 0; j < nLines; j++) {
                int moves = fs.nextInt();
                String moveDirections = fs.next();
                int ans = 0;
                for (int i = 0; i < moves; i++) {
                    if (moveDirections.toCharArray()[i] == 'D') {
                        ans++;
                    } else {
                        ans--;
                    }
                }

                int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
                        1, 2, 3, 4, 5, 6, 7, 8, 9 };
                boolean firstMeet = false;
                for (int i = 0; i < nums.length; i++) {
                    if (firstMeet == false && digits[j] == nums[i]) {
                        index = i + 10;
                        // System.out.println("index " + index);
                        ansArr.add(nums[index + ans]);
                        // System.out.println(nums[index + ans]);
                        firstMeet = true;
                    }
                }
                // System.out.println("hiii" + ans);
                
            }
            // for(int i : ansArr){
            //     System.out.print(i + " ");
            // }
            for(int i = 0; i < ansArr.size()-1; i++){
                System.out.print(ansArr.get(i) + " ");
            }
            System.out.print(ansArr.get(ansArr.size()-1));
            System.out.println();
        }
    }

}
