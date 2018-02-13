import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class RomanStringSorting implements Comparable<RomanStringSorting> {
    String firstName;
    String lastName;
    int lastNameValue;

    public RomanStringSorting(String firstName, String lastName, int lastNameValue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastNameValue = lastNameValue;
    }
    public static int romanToInt(String s){
        int num[]=new int[s.length()];
        int sum=0;
        int i=0;
        for(char c:s.toCharArray()){
            switch (c){
                case 'X':
                    num[i++]=10;
                    break;
                case 'V':
                    num[i++]=5;
                    break;
                case 'I':
                    num[i++]=1;
                    break;
            }
        }
        for(i=0;i<num.length-1;i++){
            if(num[i]<num[i+1]){
                sum-=num[i];
            }else{
                sum+=num[i];
            }
        }
        return sum+num[num.length-1];
    }
 public static Comparator<RomanStringSorting> byValue= new Comparator<RomanStringSorting>() {
     @Override
     public int compare(RomanStringSorting o1, RomanStringSorting o2) {
         return o1.lastNameValue-o2.lastNameValue;
     }
 };
    public static Comparator<RomanStringSorting> byName=new Comparator<RomanStringSorting>() {
       public int compare(RomanStringSorting o1,RomanStringSorting o2){
           return o1.firstName.compareTo(o2.firstName);
       }
    };
    public static void main(String[] args) {
        String st[]= {"Phil XVI","Henry IV"};
        ArrayList<RomanStringSorting> al=new ArrayList<>();
        for(String s:st){
            al.add(new RomanStringSorting(s.split(" ")[0],s.split(" ")[1],romanToInt(s.split(" ")[1])));
        }
        System.out.println(al.get(0).lastNameValue);
        //Collections.sort(al);
        Collections.sort(al,byName);
        System.out.println(al.get(0).firstName+" "+al.get(1).firstName);
    }

    @Override
    public int compareTo(RomanStringSorting o) {
        return this.lastNameValue-o.lastNameValue;
    }
}

