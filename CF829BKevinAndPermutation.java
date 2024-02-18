import java.util.ArrayList;
import java.util.Scanner;

public class CF829BKevinAndPermutation {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = input / 2 + 1; i <= input; i++) {
                arr.add(i);
                arr.add(i - input / 2);
            }

            if(input % 2 == 0){
                for(int i : arr){
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                for(int i = 0; i < arr.size()-1; i++){
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}

/*
 * 6
 * 4 1 5 2 6 3
 * 
 * 7
 * 4 1 5 2 6 3 7
 * 
 * 8
 * 5 1 6 2 7 3 8 4
 * 
 */