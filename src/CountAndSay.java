public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay obj=new CountAndSay();
        System.out.println(obj.countAndSay(4));
    }
    public String countAndSay(int n) {
        String current = "1";
        for (int i = 1; i < n ; i++) {
            current = convert(current);
        }
        return current;
    }

    private String convert(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                count ++;
            } else {
                sb.append(count);
                sb.append(c);
                count = 1;
            }
        }
        return sb.toString();
    }
}
