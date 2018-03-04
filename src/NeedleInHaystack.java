import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NeedleInHaystack {
    public static void main(String[] args) {
        String needle = "ABC";
        String haystack = "ABCDSGDABCSAGAABCCCCAAABAABC";
        Pattern p = Pattern.compile(needle);
        Matcher match = p.matcher(haystack);
        int k=0;
        while (match.find()) {
            System.out.println(++k);
        }

        //Method 2

        int i = 0, count = 0;
        while (i < haystack.length()) {
            if (haystack.indexOf(needle) >= 0) {
                int index = haystack.indexOf(needle);
                count++;
                haystack = new StringBuilder(haystack).delete(i, index + needle.length()).toString();
                i = index + needle.length();
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}