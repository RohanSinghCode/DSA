public class BubbleSort {
    public int[] sortByRecurrsion(int[] arr, int lastSortedIndex, int currIndex)
    {
        if (lastSortedIndex == 0)
        {
            return arr;
        }

        if (currIndex == lastSortedIndex)
        {
            return sortByRecurrsion(arr, lastSortedIndex - 1, 0);
        }

        if (arr[currIndex] > arr[currIndex+1]) {
            int temp = arr[currIndex];
            arr[currIndex] = arr[currIndex + 1];
            arr[currIndex + 1] =temp;
        }

        return sortByRecurrsion(arr, lastSortedIndex, currIndex + 1);
    }
}
