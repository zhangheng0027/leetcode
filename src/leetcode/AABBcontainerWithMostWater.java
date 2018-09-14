package leetcode;


/**
 * 
 * https://leetcode-cn.com/problems/container-with-most-water/description/
 * @author ZhangHeng
 *
 */
public class AABBcontainerWithMostWater {

	public int maxArea(int[] height) {
        
		int s = 0;
		for (int left = 0, right = height.length - 1; left < right;) {
			int a = (right - left) * Math.min(height[left], height[right]);
			if (a > s)
				s = a;
			if (height[left] < height[right])
				left++;
			else right--;
		}
		
		return s;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		AABBcontainerWithMostWater a = new AABBcontainerWithMostWater();
		System.out.println(a.maxArea(arr));
		
	}
}
