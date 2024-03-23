import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort class1 = new SelectionSort();
        int [] arr = new int[] {10,2,3,12,22,0,0,0,5,8};
        ArrayList<Integer> sortedArr = new ArrayList<>();
        var unsortarr = class1.sortByRecurrsion(arr, 0, arr.length - 1, 0);
        for (int value : unsortarr) {
            sortedArr.add(value);
        }
        System.out.println(sortedArr);
    }
}
