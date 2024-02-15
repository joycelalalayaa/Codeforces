public class interviewQuestion1 {
    public static void main(String[] args) {
        boolean ans = isPal("Race car");
        System.out.println(ans);

    }

    public static boolean isPal(String p) {
        // int i = 0;
        p = p.replaceAll(" ", "");
        for (int j = p.length() - 1; j >= 0; j--) {
            if (Character.toUpperCase(p.charAt(p.length() - j - 1)) != Character.toUpperCase(p.charAt(j))) {
                return false;
            }
            // i = i + 1;
        }

        return true;
    }

    static boolean palWithNonLetters(String p) {
        int i=0;
        int j=p.length()-1;
        while (i<j) {
            if (!isLetter(p.charAt(i))) {
                i++;
                continue;
            }
            if (!isLetter(p.charAt(j))) {
                j--;
                continue;
            }
            char iChar=Character.toLowerCase(p.charAt(i));
            char jChar=Character.toLowerCase(p.charAt(j));
            if (iChar!=jChar) {
                return false;
            }
        }
        return true;
    }

    //helper method
    static boolean isLetter(char c) {
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}
