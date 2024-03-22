public class CheckArraySort {
    public boolean isArraySorted(int [] arr, int currIndex)
    {
        if (currIndex == arr.length - 1)
        {
            return true;
        }

        if (arr[currIndex] < arr[currIndex+1])
        {
            return isArraySorted(arr, currIndex + 1);
        } else {
            return false;
        }
    }
}
