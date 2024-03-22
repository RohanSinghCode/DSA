public class LinearSearch {
    public int linearSearch(int[] arr, int target, int currIndex) {
        if (currIndex == arr.length)
        {
            return -1;
        }

        if (arr[currIndex] == target) {
            return currIndex;
        }

        return linearSearch(arr, target, currIndex+1);
    }
}
