import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
* Write a method that returns a number that appears only once in an array.
Assume the array will surely have a unique value. The array will never be empty.
Examples:

{1,2,3,4,1,2,4,3,5} ==> 5
* */
public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 6, 6, 6, 5, 3, 3, 3, 1, 6};
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : A) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        Integer minKey=0;
      for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
          if(minKey==0 || entry.getValue()<hmap.get(minKey)){
              minKey=entry.getKey();
          }
      }
        hmap.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("Number that appeared once is "+ minKey+":"+hmap.get(minKey));
    }
}
