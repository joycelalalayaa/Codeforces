import java.util.Scanner;

public class CF928AVladAndTheBestOFive {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] arr = fs.next().toCharArray();
            int countA = 0;
            int countB = 0;
            for(char c : arr){
                if(c == 'A'){
                    countA++;
                } else{
                    countB++;
                }
            }
            if(countA > countB){
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
