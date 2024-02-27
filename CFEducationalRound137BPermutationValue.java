import java.util.*;;

public class CFEducationalRound137BPermutationValue {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            if (len == 3) {
                System.out.println("1 3 2");
            } else if (len == 4) {
                System.out.println("1 4 3 2");
            } else if (len == 5) {
                System.out.println("1 4 3 5 2");
            } else if (len == 6) {
                System.out.println("4 1 6 2 5 3");
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(1);
                for (int i = len + 1; i > 2; i--) {
                    arr.add(i - 1);
                }
                for (int i = 0; i < len; i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}
