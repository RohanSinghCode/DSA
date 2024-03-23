import java.util.Arrays;
import java.util.Stack;

public class BalancedBrackets {
    public boolean checkForBalance(char [] expression, int n)
    {
        if (n == 1)
        {
            return false;
        }

        if (n==0)
        {
            return true;
        }

        if (expression[0] == ']' || expression[0] == ')' || expression[0] == '}')
        {
            return false;
        }

        char closingBracket = getClosingBracket(expression[0]);

        int i, count = 0;
        for(i = 1; i<n;i++)
        {
            if (expression[i] == expression[0])
            {
                count++;
            } else if (expression[i] == closingBracket) {
                if (count == 0)
                {
                    break;
                }

                count--;
            }
        }

        if(i == n)
        {
            return false;
        }

        if (i == 1)
        {
            return checkForBalance(Arrays.copyOfRange(expression, i+1, n), n-2);
        }

        return checkForBalance(Arrays.copyOfRange(expression, 1, i), i - 1) && checkForBalance(Arrays.copyOfRange(expression, i + 1, n), n - i -1);
    }

    public Character getClosingBracket(char bracket)
    {
        switch (bracket)
        {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
        }

        return null;
    }
}
