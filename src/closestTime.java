import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class closestTime {
    public static void main(String[] args) {
        String time="12:53";
        ArrayList<Integer> list=new ArrayList<>();
        list.add(Integer.parseInt(time.charAt(0)+""));
        list.add(Integer.parseInt(time.charAt(1)+""));
        list.add(Integer.parseInt(time.charAt(3)+""));
        list.add(Integer.parseInt(time.charAt(4)+""));
        System.out.println(list);
       ArrayList<Integer> listCopy= (ArrayList<Integer>) list.clone();
        Collections.sort(list);
        if(list.indexOf(listCopy.get(3)) <list.size()-1){

        }
    }
}
