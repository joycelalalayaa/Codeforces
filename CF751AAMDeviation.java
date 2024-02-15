import java.util.Scanner;

public class CF751AAMDeviation {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int sum = 0;
            for(int i = 0; i < 3; i++){
                int[] arr = new int[3];
                arr[i] = fs.nextInt();
                sum += arr[i];
            }
            if(sum % 3 == 0){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
/*
1 8 1
2 7 1
3 6 1
4 5 1
5 4 1
6 3 1

 */