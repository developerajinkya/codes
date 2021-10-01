import java.util.*;
public class PatternChaser {
    String PatternChaser(String str) {
        String p = null;
        int count;

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String subStr = str.substring(i, j + 1);
                count = 1;

                for (int k = 0; k < str.length() - subStr.length() + 1; k++) {
                    if (k == i) continue;
                    if (subStr.equals(str.substring(k, k + subStr.length()))) {
                        count++;
                    }
                }

                if (count >= 2 && (p == null || p.length() < subStr.length())) {
                    p = subStr;
                }
            }
        }


        return p != null ? "yes " + p : "no null";

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        PatternChaser c = new PatternChaser();
        System.out.print(c.PatternChaser(s.nextLine()));
    }
}
