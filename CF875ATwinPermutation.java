import java.util.*;

public class CF875ATwinPermutation {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            Integer[] arr = new Integer[len];
            for(int i = 0; i < len; i++){
                arr[i] = fs.nextInt();
            }
            // System.out.println(Arrays.toString(arr));
            List<Integer> newArr = new ArrayList<>(Arrays.asList(arr));
            Collections.shuffle(newArr);
            // for(int i = 0; i < len-1; i ++){
            //     if(arr[i] + newArr[i] <= arr[i+1] + newArr[i+1]){
            //         System.out.print(newArr[i] + " ");
            //     }
            // }
            for(int i = 0; i < len; i++) {
                if (arr[i] + newArr.get(i) > arr[(i + 1) % 1] + newArr.get((i + 1) % 1)) {
                    int temp = newArr.get(i);
                    newArr.set(i, newArr.get((i + 1) % 1));
                    newArr.set((i + 1) % 1, temp);
                    
                }
            }

            for(int i = 0; i < len; i++) {
                System.out.print(newArr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
