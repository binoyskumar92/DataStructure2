import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Parantheses {
    public static final int FLAG = 0;

    public static void main(String[] args) {
        String st="([)";
        HashSet<Character> set=new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');
        set.add(']');
        set.add('}');
        set.add(')');
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack=new Stack<>();

        int i=0;
        for(char c:st.toCharArray()) {
            if (i == 0) {
                stack.push(c);
                i++;
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == map.get(c)) {
                        stack.pop();
                    }else if((set.contains(c))){
                        stack.push(c);
                    }
                }else{
                    if(set.contains(c)) {
                        stack.push(c);
                    }
                }

            }
        }
        if(stack.size()==0){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
