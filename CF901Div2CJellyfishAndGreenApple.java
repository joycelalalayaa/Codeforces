import java.util.*;
public class CF901Div2CJellyfishAndGreenApple {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for(int tc = 0; tc < testcases; tc++){
            double appleNum = fs.nextInt();
            double peopleNum = fs.nextInt();
            double operations = 0;
            if(appleNum % peopleNum == 0){
                System.out.println(0);
            } else {
                if(peopleNum % 4 != 0){
                    System.out.println(-1);
                } else {
                    double appleShared = (appleNum % peopleNum) / peopleNum;
                    
                    // System.out.println("appleNum = " +appleNum + " peopleNum = " + peopleNum + " appleNum % peopleNum = " + appleNum % peopleNum);
                    // System.out.println(3.0/4.0);
                    // operations = 1/((appleNum % peopleNum) / peopleNum);
                    // System.out.println(operations);
                    // int ans = (int) Math.round(operations);
                    // System.out.println(ans);
                }

            }
        }
    }
}
