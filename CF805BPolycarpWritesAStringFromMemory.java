import java.util.*;

public class CF805BPolycarpWritesAStringFromMemory {
    // public static void main(String[] args) {
    //     Scanner fs = new Scanner(System.in);
    //     int testcases = fs.nextInt();
    //     for (int tc = 0; tc < testcases; tc++) {
    //         String input = fs.next();
    //         HashSet<Character> arr = new HashSet<>();
    //         int ans = 0;
    //         for (int i = 0; i < input.length()-1; i++) {
    //             arr.add(input.charAt(i));
    //             if (arr.size() == 3 && !arr.contains(input.charAt(i+1))) {
    //                 ans++;
    //                 arr.clear(); 
    //             }
    //         }
    //         ans++; 
    //         System.out.println(ans);
    //     }
    // }

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        for (int testcases = fs.nextInt(), ans=0; testcases-->0;) {
            String input = fs.next();
            HashSet<Character> arr = new HashSet<>();
            for (char c:input.toCharArray()) {
                arr.add(c);
                if (arr.size() == 4) {
                    ans++;
                    arr.clear(); 
                    arr.add(c);
                }
            }
            System.out.println(ans);
        }
    }
}
