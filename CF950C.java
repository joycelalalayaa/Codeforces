import java.util.*;
public class CF950C {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int testcases = fs.nextInt();
        for (int tc = 0; tc < testcases; tc++) {
            int len = fs.nextInt();
            int[] a = new int[len];
            int[] b = new int[len];

            for (int i = 0; i < len; i++) {
                a[i] = fs.nextInt();  
            }
            for (int i = 0; i < len; i++) {
                b[i] = fs.nextInt(); 
            }

            int m = fs.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = fs.nextInt();
            }

            int lastNum = nums[m - 1];
            boolean lastNumPresent = false;
            for (int value : b) {
                if (value == lastNum) {
                    lastNumPresent = true;
                    break;
                }
            }

            TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
            for(int num : nums){
                if(frequencyMap.containsKey(num)){
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }

            boolean otherThanLast = true;
            for (int i = 0; i < len; i++) {
                if (a==b) {
                    continue;
                }
                if (!frequencyMap.containsKey(b[i])) {
                    otherThanLast=false;
                    break;
                }
                if (frequencyMap.get(b[i]) > 1) {
                    frequencyMap.put(b[i], frequencyMap.get(b[i]) - 1);
                } else if (frequencyMap.get(b[i]) == 1) {
                    frequencyMap.remove(b[i]);
                }
            }
            

            if (lastNumPresent && otherThanLast) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}












// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;

// public class CF950C {
//     public static void main(String[] args) {
//         Scanner fs = new Scanner(System.in);
//         int testcases = fs.nextInt();
//         for (int tc = 0; tc < testcases; tc++) {
//             int len = fs.nextInt();
//             int[] a = new int[len];
//             int[] b = new int[len];

//             for (int i = 0; i < len; i++) {
//                 a[i] = fs.nextInt();
//             }
//             for (int i = 0; i < len; i++) {
//                 b[i] = fs.nextInt();
//             }

//             int m = fs.nextInt();
//             int[] nums = new int[m];
//             for (int i = 0; i < m; i++) {
//                 nums[i] = fs.nextInt();
//             }

//             int lastNum = nums[m - 1];
//             boolean lastNumPresent = false;
//             for (int value : b) {
//                 if (value == lastNum) {
//                     lastNumPresent = true;
//                     break;
//                 }
//             }

//             HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//             for (int num : nums) {
//                 frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//             }

//             Map<Integer, Integer> neededChanges = new HashMap<>();
//             for (int i = 0; i < len; i++) {
//                 if (a[i] != b[i]) {
//                     neededChanges.put(b[i], neededChanges.getOrDefault(b[i], 0) + 1);
//                 }
//             }

//             boolean possible = true;
//             for (Map.Entry<Integer, Integer> entry : neededChanges.entrySet()) {
//                 int key = entry.getKey();
//                 int needed = entry.getValue();
//                 if (frequencyMap.getOrDefault(key, 0) < needed) {
//                     possible = false;
//                     break;
//                 }
//             }

//             System.out.println(possible && lastNumPresent ? "YES" : "NO");
//         }
//         fs.close();
//     }
// }
