import java.io.PrintWriter;
import java.util.Scanner;

public class CF886CWordOnPaper {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        // PrintWriter out = new PrintWriter(System.out);
        int testcases = fs.nextInt();
        StringBuilder total = new StringBuilder();
        for (int tc = 0; tc < testcases; tc++) {
            char[][] grid = new char[8][8];
            for(int i = 0; i < 8; i++){
                String row = fs.next();
                for(int j = 0; j < 8; j++){
                    grid[i][j] = row.charAt(j);
                }
            }
            String word = assembleWord(grid);
            total.append(word);
            // System.out.print(word);
        }
        System.out.print(total);
        // out.close();
    }

    public static String assembleWord(char[][] grid){
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j< 8; j++){
                char currentChar = grid[j][i];
                if(currentChar != '.'){
                    word.append(currentChar);
                }
            }
        }
        word.append("\n");
        return word.toString();
    }
}
