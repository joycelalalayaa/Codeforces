import java.util.Scanner;

public class EvenSums {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for(int tc = 0; tc< testcases; tc++){
            long input = fs.nextInt();
            long evenSum = 0;
            if(input % 2 == 0){
                evenSum = (input/2) * (input/2 + 1);
            } else {
                evenSum = ((input-1)/2) * ((input-1)/2 + 1);
            } // dont need because 5 / 2 is 2, and 4 / 2 is 2
            System.out.printf("even sum up to input is %d\n", evenSum);
        }
    }
    
}
