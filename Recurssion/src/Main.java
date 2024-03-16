import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        ans.add(input);
        sumTriangle(input);
        System.out.println(ans);
    }


    static void sumTriangle(ArrayList<Integer> arr)
    {
        if (arr.size() == 1)
        {
            return;
        }
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i=0;i< arr.size()-1; i++)
        {
            int sum = arr.get(i) + arr.get(i+1);
            newArray.add(sum);
        }
        ans.add(newArray);
        sumTriangle(newArray);
    }
}
