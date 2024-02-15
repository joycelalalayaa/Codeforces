import java.util.Scanner;

/*
4 9 16 25 36 49 64

1  2  5  10 17 26 37
4  3  6  11 18 27 38
9  8  7  12 19 28 39
16 15 14 13 20 29 40
25 24 23 22 21 30 41
36 35 34 33 32 31 42
49 48 47 46 45 44 43

 */
public class CF739CInfinityTable {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        outer: for (int tc = 0; tc < testcases; tc++) {
            int input = fs.nextInt();
            if(input == 1){
                System.out.println(1 + " " + 1);
            }
            if(input == 2){
                System.out.println(1 + " " + 2);
            }
            for(int i = 0; i < input; i++){
                if(i * i >= input){
                    if(i * (i-1) >= input){
                        System.out.println((i-1 -(i * (i-1) - input)) + " " + i);
                        continue outer;
                    } else {
                        System.out.println(i + " " + (i * i - input + 1));
                        continue outer;
                    }
                }
            }
        }
    }
}
