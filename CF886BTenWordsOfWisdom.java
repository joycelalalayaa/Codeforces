import java.util.Scanner;

// public class CF866BTenWordsOfWisdom {
    // public static void main(String[] args) {
    //     Scanner fs = new Scanner(System.in);
    //     int testcases = fs.nextInt();
    //     for (int tc = 0; tc < testcases; tc++) {
    //         int len = fs.nextInt();
    //         int quality = fs.nextInt();
    //         int[][] twoD = new int[testcases][2];
    //         twoD.append[len][quality];
            
    //     }
    // }


class Response {
    int words;
    int quality;
    int index;

    public Response(int words, int quality, int index) {
        this.words = words;
        this.quality = quality;
        this.index = index;
    }
}

public class CF886BTenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Number of responses
            Response winner = null;

            for (int i = 0; i < n; i++) {
                int words = scanner.nextInt(); // Number of words in the response
                int quality = scanner.nextInt(); // Quality of the response

                if (words <= 10 && (winner == null || quality > winner.quality)) {
                    // If the current response has 10 words or less and has higher quality than the current winner
                    winner = new Response(words, quality, i + 1);
                }
            }

            System.out.println(winner.index); // Print the index of the winning response for the current test case
        }

        scanner.close();
    }
}

// }
