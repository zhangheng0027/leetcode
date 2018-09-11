package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * @author zhangH
 *
 */
public class AAABtwoSum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	temp.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
        	if (temp.containsKey(target - nums[i]) && i != temp.get(target - nums[i])) {
        		int [] result = {temp.get(target - nums[i]), i};
        		return result;
        	}
        }
        return null;
        
    }
}
