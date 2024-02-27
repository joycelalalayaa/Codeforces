import java.util.*;
public class CF486ADiverseTeam {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int len = fs.nextInt(), distinctNum = fs.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = fs.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ansIndex = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
                ansIndex.add(i+1);
            } 
        }
        if(ansIndex.size() >= distinctNum){
            System.out.println("YES");
            for(int i = 0; i < distinctNum; i++){
                System.out.print(ansIndex.get(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}
