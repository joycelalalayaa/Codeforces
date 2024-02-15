import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF920ASquare {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int[] arr = new int[8];
            for (int i = 0; i < 8; i++) {
                arr[i] = fs.nextInt();
            }
            ArrayList<Integer> xAxis = new ArrayList<>();
            ArrayList<Integer> yAxis = new ArrayList<>();

            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    xAxis.add(arr[i]);
                } else {
                    yAxis.add(arr[i]);
                }
            }
            int x = 0;
            int y = 0;
            boolean ifFound = false;
            boolean ifYFound = false;
            for(int i = 0; i < 4; i++){
                if(ifFound == false && (int)xAxis.get(i) != (int)xAxis.get(i+1)){
                    ifFound = true;
                    x = Math.abs(xAxis.get(i) - xAxis.get(i+1));
                }
                if(ifYFound == false && (int)yAxis.get(i) != (int)yAxis.get(i+1)){
                    ifYFound = true;
                    y = Math.abs(yAxis.get(i) - yAxis.get(i+1));
                }
            }

            System.out.println(x * y);
        }
    }

}
