import java.util.Scanner;

public class CF742ADominoDisaster {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            char[] arr = fs.next().toCharArray();
            for(int i = 0; i < len; i++){
                int index = "LRUD".indexOf(arr[i]);
                System.out.print("LRDU".charAt(index));
                // if(arr[i] == 'L'){
                //     System.out.print('L');
                // }
                // if(arr[i] == 'R'){
                //     System.out.print('R');
                // }
                // if(arr[i] == 'U'){
                //     System.out.print('D');
                // }
                // if(arr[i] == 'D'){
                //     System.out.print('U');
                // }
            }
            System.out.println();
        }
    }
}
