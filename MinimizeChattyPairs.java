import java.util.*;

public class MinimizeChattyPairs {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt(); 

        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = fs.next();
            char firstLetter = name.charAt(0);
            counts.put(firstLetter, counts.getOrDefault(firstLetter, 0) + 1);
        }

        int minPairs = 0;

        for (int count : counts.values()) {
            int a = count / 2;    
            int b = count - a;    
            minPairs += (a * (a - 1)) / 2; 
            minPairs += (b * (b - 1)) / 2;
        }

        System.out.println(minPairs);
    }
}
