import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.*;

public class regex {
    public static void main(String[] args) {
        String st="abccddde";
//        Pattern pattern=Pattern.compile("[s]+");
//        Matcher matcher=pattern.matcher(st);
//        int count=0;
//        while(matcher.find()){
//            count++;
//        }
//        System.out.println("Count: "+count);
        HashSet<Integer> set=new HashSet<>();
        int i=0,j=1;
       while(i<st.length()){
           int value=(int)st.charAt(i)-96;
           int uniformValue=value;
           j=i+1;
           set.add(uniformValue);
           while(j<st.length()){
               if(st.charAt(i)==st.charAt(j)){
                   uniformValue+=value;
                   set.add(uniformValue);
               }else{
                   break;
               }

               j++;
           }
           i=j;
       }
        System.out.println(set);
    }
}
