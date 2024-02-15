import java.util.Scanner;

public class CF923BFollowingTheString {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = fs.nextInt();
            }
            
            System.out.println(stringGenerator(arr));
        }
        fs.close();
    }
    
    private static String stringGenerator(int[] trace) {
        StringBuilder s = new StringBuilder();
        int[] charCount = new int[26]; 
        
        for (int i = 0; i < trace.length; i++) {
            if (trace[i] == 0) {
               
                for (int j = 0; j < 26; j++) {
                    if (charCount[j] == 0) {
                        s.append((char)('a' + j));
                        charCount[j]++;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < 26; j++) {
                    if (charCount[j] == trace[i]) {
                        s.append((char)('a' + j));
                        charCount[j]++;
                        break;
                    }
                }
            }
        }
        return s.toString();
    }
}
