import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int [] arr)
    {
        if (arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right)
    {
        int mix[] = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int i = 0;
        while(leftPointer < left.length && rightPointer < right.length)
        {
            if (left[leftPointer] < right[rightPointer])
            {
                mix[i] = left[leftPointer];
                leftPointer++;
            } else {
                mix[i] = right[rightPointer];
                rightPointer++;
            }
            i++;
        }

        while (leftPointer < left.length)
        {
            mix[i] = left[leftPointer];
            i++;
            leftPointer++;
        }
        while (rightPointer < right.length)
        {
            mix[i] = right[rightPointer];
            i++;
            rightPointer++;
        }

        return mix;
    }
}
