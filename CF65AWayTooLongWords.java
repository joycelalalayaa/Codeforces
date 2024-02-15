import java.util.*;

public class CF65AWayTooLongWords {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String input = fs.next();
            ArrayList<Character> arr = new ArrayList<>();
            for(char c : input.toCharArray()){
                arr.add(c);
            }
            if(arr.size()<= 10){
                for(char c : arr){
                    System.out.print(c);
                }
                System.out.println();
            } else {
                System.out.print(arr.get(0) + "" + (arr.size()-2) + arr.get(arr.size()-1));
                System.out.println();
            }
        }
    }
}
