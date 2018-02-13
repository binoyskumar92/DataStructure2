import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//        for(char c:s.toCharArray()){
//            if(!map.containsKey(c)){
//                map.put(c,1);
//            }else{
//                int i=map.get(c);
//                i++;
//                map.put(c,i);
//            }
//
//        }
//        for(Character c:map.keySet()){
//            int count = map.get(c);
//            if(count>1){
//                count = count*((int)c-96);
//                map.put(c,count);
//            }
//        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            int j=i+1,count=0;
            while(j<s.length()){
                if(s.charAt(j)==s.charAt(j-1)){
                    count=count+2;
                    j++;
                }else{
                    break;
                }
            }
            map.put(s.charAt(i),count);
        }
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(map.containsValue(x)){
                System.out.println("Yes");
            }else{
                System.out.println("No");;
            }

        }
    }
}


