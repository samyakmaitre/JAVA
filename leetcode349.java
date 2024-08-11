import java.util.HashSet;
import java.util.Set;

public class leetcode349{
    public static void main(String[] args) {
        
    }
}

class Solution{
    public int[] inter(int[] nums1, int[] nums2){

        //convert arrays to set
        Set<Integer> set1 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set2.add(x);
        }

        set1.retainAll(set2);

        //set to array
        int result[]  = new int[set1.size()];
        int i = 0;
        for(int num : set1){
            result[i++] = num;
        }

        return result;
    }
}