import java.util.Arrays;

public class BinarySearchRecurrsion {
    public int binarySearch(int [] numbs, int target)
    {
        return binarySearchByRecursion(numbs, target, 0, numbs.length - 1);
    }

    public int binarySearchByRecursion(int [] nums, int target, int start, int end)
    {
        if (start > end)
        {
            return -1;
        }

        int mid = (start+end)/2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearchByRecursion(nums, target, start, mid - 1);
        } else {
            return binarySearchByRecursion(nums, target, mid + 1, end);
        }
    }
}
