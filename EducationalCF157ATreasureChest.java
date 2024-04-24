import java.util.*;
public class EducationalCF157ATreasureChest {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int chest = fs.nextInt(), key = fs.nextInt(), stamina = fs.nextInt();
            if (key < chest) {
                System.out.println(chest);
            } else {
                System.out.println(key + Math.max(0, key - chest - stamina));
            }
        }
    }
}
