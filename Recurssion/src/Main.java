import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinAndMax class1 = new MinAndMax();
        int [] arr = new int[] {1, 4, 3, -5, -4, 8, 6};
        class1.findMinAndMax(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}
