import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> buffDict=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(buffDict.containsKey(nums[i]))
                return new int[]{buffDict.get(nums[i]),i};
            buffDict.put(target-nums[i], i);
        }

        return null;
    }
}