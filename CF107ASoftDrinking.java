import java.util.*;

public class CF107ASoftDrinking {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);

        int n = fs.nextInt(), k = fs.nextInt(), l = fs.nextInt(), c = fs.nextInt();
        int d = fs.nextInt(), p = fs.nextInt(), nl = fs.nextInt(), np = fs.nextInt();
        int n1 = k * l / nl;
        int n2 = c * d;
        int n3 = p / np;
        System.out.println(Math.min(Math.min(n1, n2), Math.min(n2, n3))/n);
    }

}
