import java.util.*;

public class CFTechnocup2019Round2AGoldenPlate {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int col = fs.nextInt(), row = fs.nextInt(), ring = fs.nextInt();
        int[] colLen = new int[2 * ring], rowLen = new int[2 * ring];
        for(int i = 0; i < colLen.length; i++){
            colLen[i] = col - 2 * i;
        }
        for(int i = 0; i < rowLen.length; i++){
            rowLen[i] = row - 2 * i;
        }
        int outer = 0;
        for(int i = 0; i < 2*ring; i+=2){
            outer += colLen[i] * rowLen[i];
        }
        int inner = 0;
        for(int i = 1; i <= 2*ring; i+=2){
            inner += colLen[i] * rowLen[i];
        }
        System.out.println(outer - inner);
    }
}
