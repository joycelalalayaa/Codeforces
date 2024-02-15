import java.util.*;

public class CF894AGiftCarpet {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int height = fs.nextInt();
            int width = fs.nextInt();
            char[][] input = new char[width][height];
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    input[w][h] = fs.next().charAt(0);
                }
            }

            System.out.println("Entered 2D char array:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(input[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
