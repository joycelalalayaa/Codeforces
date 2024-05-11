import java.util.*;

public class CF944B {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            char[] arr = input.toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            for (char c : arr) {
                charList.add(c);
            }
            Collections.sort(charList);
            for (int i = 0; i < charList.size(); i++) {
                arr[i] = charList.get(i);
            }
            String s = new String(arr);

            if (s.equals(input)) {
                Collections.reverse(charList);
                for (int i = 0; i < charList.size(); i++) {
                    arr[i] = charList.get(i);
                }
                String s2 = new String(arr);
                if (s2.equals(input)) {
                    System.out.println("NO");
                    continue;
                }
            }
            System.out.println("YES");
            System.out.println(arr);

        }

    }
}
