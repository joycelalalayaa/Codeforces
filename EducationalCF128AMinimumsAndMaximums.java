import java.util.Scanner;

public class EducationalCF128AMinimumsAndMaximums {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt(); 

        for (int i = 0; i < t; i++) {
            int l1 = fs.nextInt();
            int r1 = fs.nextInt();
            int l2 = fs.nextInt();
            int r2 = fs.nextInt();

            if (Math.max(l1, l2) <= Math.min(r1, r2)) {
                System.out.println(Math.max(l1, l2));
            } else {
                System.out.println(l1 + l2);
            }
        }
    }
}
