import java.util.*;

public class CF905AMorning {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            char[] num = fs.next().toCharArray();
            int ans = 0;
            if (num[0] != '0') {
                ans = 4 + num[0] - '1';
            } else {
                ans = 13;
            }
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i + 1] != '0' && num[i] != '0' || num[i + 1] == '0' && num[i] == '0') {
                    ans += Math.abs(num[i + 1] - num[i]);
                } else {
                    if(num[i+1] == '0'){
                        ans += Math.abs((10 + (num[i+1])) - num[i]);
                    } else {
                        ans += Math.abs((num[i+1]) - (10 + num[i]));

                    }
                } 
            }
            System.out.println(ans);

        }
    }

}

