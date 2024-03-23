import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BalancedBrackets class1 = new BalancedBrackets();
        String brackets = "[()]{}{[()()]()((())((())))))}";
        System.out.println(class1.checkForBalance(brackets.toCharArray(), brackets.length()));
    }
}
