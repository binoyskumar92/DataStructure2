import java.lang.reflect.Array;
import java.util.Arrays;

public class ShortestPallindrome {
    public static void main(String[] args) {
        String st="aabba";
        ShortestPallindrome obj=new ShortestPallindrome();
        StringBuilder sb=new StringBuilder(st);
        String revStr=sb.reverse().toString();
        int[] kmp=obj.findKmp(st,revStr);
        System.out.println(Arrays.toString(kmp));
        //System.out.println(obj.shortestPalindrome(st));
    }
//    public String shortestPalindrome(String s) {
//        String temp = s + "#" + new StringBuilder(s).reverse().toString();
//        int[] table = getTable(temp);
//        System.out.println("table2: "+ Arrays.toString(table));
//        return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
//    }
//
//    public int[] getTable(String s){
//        int[] table = new int[s.length()];
//
//        int index = 0;
//        for(int i = 1; i < s.length(); ){
//            if(s.charAt(index) == s.charAt(i)){
//                table[i] = ++index;
//                i++;
//            } else {
//                if(index > 0){
//                    index = table[index-1];
//                } else {
//                    index = 0;
//                    i ++;
//                }
//            }
//        }
//        return table;
//    }
    /*public String longestPalindrome(String s) {
        if(s==null || s.length()<=1)
            return s;

        int len = s.length();
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];

        String longest = null;
        for(int l=0; l<s.length(); l++){
            for(int i=0; i<len-l; i++){
                int j = i+l;
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;

                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        longest = s.substring(i, j+1);
                    }
                }
            }
        }

        return longest;
    }*/

    private int[] findKmp(String st,String revStr) {
    String newStr=st+"#"+revStr;
    int j=0,i=1;
    int[] kmp=new int[newStr.length()];
    while(i<newStr.length()) {
        if (newStr.charAt(j) == newStr.charAt(i)) {
            kmp[i] = j + 1;
            i++;
            j++;
        } else { //not equal
            if (j == 0) {
                kmp[i] = 0;
                i++;
            } else {
                j = kmp[j - 1];
            }
        }
    }
    System.out.println(revStr.substring(0,st.length()-kmp[newStr.length()-1])+st);
    return kmp;
    }
}
