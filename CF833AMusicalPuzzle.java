import java.util.*;

public class CF833AMusicalPuzzle {
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int testcases = fs.nextInt();
		// int moves = 0;
		for (int tc = 0; tc < testcases; tc++) {
			int length = fs.nextInt();
			String melody = fs.next();
			HashSet<String> pairs = new HashSet<String>();
			// to be sorted
			// TreeSet<String> pairs = new TreeSet<String>();
			for (int i = 0; i < length - 1; i++) {
				String cur = melody.charAt(i) + "" + melody.charAt(i + 1);
				if (pairs.contains(cur)) {
					continue;
				} else {
					pairs.add(cur);
				}
			}
			System.out.println(pairs.size());
		}
	}
}