import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complementary = target - nums[i];
            if(map.containsKey(complementary)){
                return new int[] {map.get(complementary),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}