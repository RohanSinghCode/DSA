import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        ans.add(input);
        SumTriangle class1 = new SumTriangle();
        class1.sumTriangle(input, ans);
        System.out.println(ans);
    }
}
