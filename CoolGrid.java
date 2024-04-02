import java.util.Scanner;

public class CoolGrid {
    public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        long n=fs.nextLong()-1, m=fs.nextLong()-1, k=fs.nextInt();
        if (n%2!=m%2 && k==-1) {
            System.out.println(0);
        }
        else {
            System.out.println(exp(exp(2, n), m));
        }
    }
    static long mul(long a, long b) {
        return a*b%mod;
    }

    static long exp(long base, long e) {
        if (e==0) return 1;
        long half=exp(base, e/2);
        if (e%2==0) return mul(half, half);
        return mul(half, mul(half, base));
    }

    static long mod=1000000007;
}