import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int count = set.size();
        if(count > nums.length/2){
            return nums.length / 2;
        }
        return count;
    }
}