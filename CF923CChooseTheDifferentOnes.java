import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CF923CChooseTheDifferentOnes {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int lenA = fs.nextInt();
            int lenB = fs.nextInt();
            int n = fs.nextInt();
            int[] arrAA = new int[lenA];
            int[] arrBB = new int[lenB];
            int[] arrN = new int[n];

            for (int i = 0; i < lenA; i++) {
                arrAA[i] = fs.nextInt();
            }
            for (int i = 0; i < lenB; i++) {
                arrBB[i] = fs.nextInt();
            }

            Arrays.sort(arrAA);
            Arrays.sort(arrBB);

            ArrayList<Integer> arrA = new ArrayList<>();
            ArrayList<Integer> arrB = new ArrayList<>();
            arrA.add(arrAA[arrAA.length - 1]);
            arrB.add(arrBB[arrBB.length - 1]);

            for (int i = 0; i < lenA - 1; i++) {
                if (arrAA[i] != arrAA[i + 1]) {
                    arrA.add(arrAA[i]);
                }
            }
            for (int i = 0; i < lenB - 1; i++) {
                if (arrBB[i] != arrBB[i + 1]) {
                    arrB.add(arrBB[i]);
                }
            }

            ArrayList<Integer> ans = new ArrayList<>();
            int aCount = 0;
            for (int i = 0; i < arrA.size(); i++) {
                if (arrA.get(i) <= n) {
                    ans.add(arrA.get(i));
                    aCount++;
                }
            }

            int bCount = 0;
            for (int i = 0; i < arrB.size(); i++) {
                if (arrB.get(i) <= n) {
                    ans.add(arrB.get(i));
                    bCount++;
                }
            }

            HashSet<Integer> set = new HashSet<>();
            for (int i : ans) {
                set.add(i);
            }

            for (int i = 0; i < n; i++) {
                arrN[i] = i + 1;
            }

            boolean hasAll = true;
            for (int i : arrN) {
                if (!set.contains(i)) {
                    hasAll = false;
                }
            }

            if (aCount >= n / 2 && bCount >= n / 2 && hasAll) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}