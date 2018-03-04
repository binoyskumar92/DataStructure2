import java.util.*;
import java.util.Map.*;

public class KFrequentElements {
    public static void main(String[] args) {
        int arr[]={ 1,6,2,1,6,1,6};
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr){
            if(!hmap.containsKey(i)){
                hmap.put(i,1);
            }else{
                int val=hmap.get(i);
                val++;
                hmap.put(i,val);
            }
        }

        Set<Entry<Integer,Integer>> entries=hmap.entrySet();
        List<Entry<Integer,Integer>> ll=new LinkedList<>(entries);
        Collections.sort(ll, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Entry<Integer,Integer> item:ll){
            System.out.println(item.getKey()+" "+item.getValue());;
        }
        System.out.println(hmap);
    }
}
