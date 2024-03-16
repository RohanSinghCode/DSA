import java.util.ArrayList;

public class SumTriangle {
    public static void sumTriangle(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans)
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
        sumTriangle(newArray, ans);
    }
}
