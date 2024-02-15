import java.util.Scanner;

public class Hello2023AHallOfFame {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            String input = fs.next();
            char[] arr = input.toCharArray();
            int position = 0;
            int rightLeft = 0;
            for (int i = 0; i < len - 1; i++) {
                // System.out.println(arr[i]);
                if (arr[i] == 'R' && arr[i + 1] == 'L') {
                    rightLeft++;
                } 
                if (arr[i] == 'L' && arr[i + 1] == 'R') {
                    position = i+1;
                } 
            }
            if(rightLeft > 0){
                System.out.println(0);
            } else if(rightLeft == 0 && position != 0){
                System.out.println(position);

            }else if(rightLeft == 0 && position == 0){
                System.out.println(-1);

            }


        }
    }
}
