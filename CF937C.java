import java.util.*;

public class CF937C {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            String time = fs.next();
            String[] things = time.split(":");
            int hour = Integer.parseInt(things[0]);
            String minute = things[1];
            String AMPM = "AM";
            if(hour == 0){
                hour = 12;
            } else if(hour == 12){
                AMPM = "PM";
            } else if(hour > 12){
                hour -= 12;
                AMPM = "PM";
            }
            if(hour < 10){
                System.out.println("0" + hour + ":" + minute +  " " + AMPM);
            } else {
                System.out.println(hour + ":" + minute + " " + AMPM);
            }
        }
    }
}
