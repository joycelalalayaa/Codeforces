import java.util.Scanner;

public class CF76ATwoRivalStudents {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int students = fs.nextInt();
            int swaps = fs.nextInt();
            int rivalA = fs.nextInt();
            int rivalB = fs.nextInt();
            if (swaps == 0) {
                System.out.println(Math.abs(rivalA - rivalB));
            } else {
                if (rivalA > rivalB) {
                    if ((students - rivalA + rivalB - 1) >= swaps) {
                        System.out.println(rivalA - rivalB + swaps);
                    } else {
                        System.out.println(students - 1);
                    }
                } else {
                    if ((students - rivalB + rivalA - 1) >= swaps) {
                        System.out.println(rivalB - rivalA + swaps);
                    } else {
                        System.out.println(students - 1);
                    }
                }
            }
        }
    }
}
/*
 * 3
 * 5 1 3 2
 * 100 33 100 1
 * 6 0 2 3
 * 
 * 2
 * 99
 * 1
 * 
 */
