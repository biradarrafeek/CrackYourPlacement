import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mapp.containsKey(moreNeeded)) {
                return new int[]{mapp.get(moreNeeded), i};
            }
            mapp.put(num, i);
        }
        return new int[]{-1, -1};
    }
}
