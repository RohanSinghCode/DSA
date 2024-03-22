import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort class1 = new BubbleSort();
        int [] arr = new int[] {0,10,2,3,12,22,0};
        ArrayList<Integer> sortedArr = new ArrayList<>();
        var unsortarr = class1.sortByRecurrsion(arr, arr.length - 1, 0);
        for (int value : unsortarr) {
            sortedArr.add(value);
        }
        System.out.println(sortedArr);
    }
}
