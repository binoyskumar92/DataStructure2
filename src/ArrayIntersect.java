/* 1,2,3,4,5,6,7 -> 5,6,7,1,2,3,4
    4,3,2,1,7,6,5
*
* Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersect {
    public static void main(String[] args) {
        ArrayIntersect obj=new ArrayIntersect();
        int nums1[]={1, 2, 2, 1};
        int nums2[]={2, 2};
        System.out.println(Arrays.toString(obj.intersect(nums1,nums2)));
        System.out.println(Arrays.toString(obj.method2(nums1,nums2)));

    }
    public int[] method2(int[] nums1, int[] nums2){
        /*
        * 1,1,2,4,6,7
        * 2,3,4,6,9
        * */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pnt1 = 0;
        int pnt2 = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while((pnt1 < nums1.length) &&(pnt2< nums2.length)){
            if(nums1[pnt1]<nums2[pnt2]){
                pnt1++;
            }
            else{
                if(nums1[pnt1]>nums2[pnt2]){
                    pnt2++;
                }
                else{
                    myList.add(nums1[pnt1]);
                    pnt1++;
                    pnt2++;
                }
            }
        }
        int[] res = new int[myList.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = (Integer)myList.get(i);
        }
        return res;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        //count of each number in nums1
        for(int i= 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 0);
            }
            map.put(nums1[i], map.get(nums1[i])+1);
        }
        for(int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                ans[k] = nums2[i];
                k++;
            }
        }
        return Arrays.copyOf(ans, k);

    }
}
