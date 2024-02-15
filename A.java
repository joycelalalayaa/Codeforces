import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*

5
5 6
2 5 4 6 7
12 1 4 5 6 7

2 1
3 4
7

3 3
2 3 3 
1 2 3

4 4
1 2 3 4
1 2 3 4

6 7
3 5 7 5 2 9
2 2 5 4 6 6 8


1
5 6
2 5 4 6 7
12 1 4 5 6 7

1
7 12
1 2 2 2 4 4 6
1 1 2 2 3 3 3 4 5 6 6 7

 */
public class A {
   public static void main(String[] args) {
    Scanner fs=new Scanner(System.in);
    int T=fs.nextInt();
    for (int tt=0; tt<T; tt++) {
        int na=fs.nextInt(), nb=fs.nextInt();
        int[] a=new int[na], b=new int[nb];
        for (int i=0; i<na; i++) a[i]=fs.nextInt();
        for (int i=0; i<nb; i++) b[i]=fs.nextInt();
        ruffleSort(a);
        ruffleSort(b);
        boolean works=a.length<=b.length;
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // 1 2 2 2 4 4 6
        // 1 3 2 1

        // 1 1 2 2 3 3 3 4 5 6 6 7
        // 2 2 3 1 1 2 1

        // 1 3 2 1
        // 2 2 3 1 1 2 1

        ArrayList<Integer> ac=compress(a), bc=compress(b);
        if (ac.size()>bc.size()) {
            System.out.println("否");    
            continue;
        }
        // System.out.println(ac+" "+bc);
        int ai=0;
        //         v
        // ac: 1 3 2 1
        // bc: 2 2 3 1 1 2 1
        for (int bi=0; bi<bc.size(); bi++) {
            if (ai<ac.size() && ac.get(ai)<=bc.get(bi)) {
                ai++;
            }
        }

        System.out.println(ai==ac.size()?"是":"否");
    }
   } 

   // turn an array like 1 1 2 2 3 3 3 4 5 6 6 7
   // into 2 2 3 1 1 2 1
   // 2 1s, then 2 2s, then 3 3s, and so on
   // a little different from frequency count because we skip empty spaces
   static ArrayList<Integer> compress(int[] a) {
    int lastThingISaw=a[0];
    int howManyISaw=0;
    ArrayList<Integer> toReturn=new ArrayList<>();
    for (int i:a) {
        //if this is a new number
        if (i!=lastThingISaw) {
            toReturn.add(howManyISaw);
            howManyISaw=1;
        }
        else {
            howManyISaw++;
        }

        lastThingISaw=i;
    }
    toReturn.add(howManyISaw);
    return toReturn;
   }

   static void ruffleSort(int[] a) {
    Random r=new Random();
    for (int i=0; i<a.length; i++) {
        int oi=r.nextInt(a.length);
        int temp=a[i];
        a[i]=a[oi];
        a[oi]=temp;
    }
    Arrays.sort(a);
   }
}
