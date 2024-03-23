public class SelectionSort {
    public int[] sortByRecurrsion(int[] arr, int largestElementIndex, int lastIndex, int currIndex)
    {
        if (lastIndex == 0)
        {
            return arr;
        }

        if (arr[largestElementIndex] < arr[currIndex])
        {
            largestElementIndex = currIndex;
        }

        if (currIndex == lastIndex)
        {
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;
            return sortByRecurrsion(arr, 0, lastIndex - 1, 0);
        }

        return sortByRecurrsion(arr, largestElementIndex, lastIndex, currIndex+1);
    }
}
