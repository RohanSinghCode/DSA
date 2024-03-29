import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] inp = new int []{1,2,3,1,2,3,1,2,1,1,1,2,3,4,5,6,7,8};
        System.out.println(maxSubarrayLength(inp, 2));
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        while(start <= end && end < nums.length)
        {
            if (count.containsKey(nums[end]))
            {
                count.put(nums[end], count.get(nums[end]) + 1);
            } else {
                count.put(nums[end], 1);
            }
            if (count.get(nums[end]) <= k)
            {
                max = Math.max(max, (end-start) + 1);
                end++;
            } else {
                while (count.get(nums[end]) > k) {
                    count.put(nums[start], count.get(nums[start]) - 1);
                    if (count.get(nums[start]) == 0) {
                        count.remove(nums[start]);
                    }
                    start++;
                }
                end++;
            }
        }

        max = Math.max(max, (end-start));

        return max;
    }
}
