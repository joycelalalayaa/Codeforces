import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// 54552
public class CF863AInsertDigit {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int oLen = fs.nextInt();
            int additionalNum = fs.nextInt();
            String num = fs.next();
            int[] oNum = new int[oLen];
            int cur = 0;
            for (char c : num.toCharArray()) {
                oNum[cur] = c - '0';
                cur++;
            } 

            ArrayList<Integer> ans = new ArrayList<>();

            boolean addedOrNo = false;
            for (int i = 0; i < oLen; i++) {
                if (oNum[i] >= additionalNum) {
                    ans.add(oNum[i]);
                } else {
                    if (addedOrNo == false) {
                        ans.add(additionalNum);
                        addedOrNo = true;
                    }
                    ans.add(oNum[i]);
                }
            }

            if(ans.size() == oLen){
                ans.add(additionalNum);
            }

            for (int i : ans) {
                out.print(i);
            }
            out.println();
        }
        out.close();
    }
}
