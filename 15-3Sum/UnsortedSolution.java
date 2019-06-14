import java.util.*;

class UnsortedSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = getMapWithPos(nums);
        Set<List<Integer>> items = new HashSet<>();
        
        //*** First loop, avoid copies using 'hs1' HashSet
        Set<Integer> hs1 = new HashSet<>();
        for(int i=0; i < nums.length; i++){
            if(!hs1.add(nums[i]))
                continue;
            
            //*** Second loop, avoid copies using 'hs2' HashSet
            Set<Integer> hs2 = new HashSet<>();
            for(int k=i+1; k < nums.length; k++){
                if(!hs2.add(nums[k]))
                    continue;
                    
                //*** Calc the third number (n1+n2+n3=0 -> n3=-n1-n2)
                int n3 = -nums[i]-nums[k];
                Integer pos = map.get(n3);
                
                //*** Check if the map has this number -> check if it was not visited before
                if(pos != null && pos > k){
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[pos]);
                    Collections.sort(list);
                    items.add(list);
                }
            }
        }
        return new ArrayList<>(items);
    }
    
    //*** Get Map <Number, last position in array>
    private Map<Integer, Integer> getMapWithPos(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = nums.length-1; i >= 0; i--){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        return map;
    }
}