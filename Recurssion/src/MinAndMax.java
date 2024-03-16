public class MinAndMax {
    public void findMinAndMax(int [] arr, int index, int currMin, int currMax)
    {
        if (index == arr.length) {
            System.out.println("Max: " + currMax);
            System.out.println("Min: "+ currMin);
            return;
        }

        if (arr[index] > currMax) {
            currMax = arr[index];
        }

        if (arr[index] < currMin) {
            currMin = arr[index];
        }

        findMinAndMax(arr, index+1, currMin, currMax);
    }
}
