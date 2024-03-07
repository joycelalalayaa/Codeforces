import java.util.*;

public class CF385AHongcowLearnsTheCyclicShift {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        String input = fs.next();
        HashSet<String> ans = new HashSet<>();
        ans.add(input);
        for (int i = 0; i < input.length(); i++) {
            String newString = input.substring(input.length() - 1 - i) + input.substring(0, input.length() - 1 - i);
            ans.add(newString);
        }
        
        System.out.println(ans.size());
    }
}
