import java.util.*;

public class EducationalCF32ALocalExtrema {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = fs.nextInt();
        }
        int extreme = 0;
        for (int i = 1; i < len - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                extreme++;
            }
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                extreme++;
            }
        }
        System.out.println(extreme);
    }
}
