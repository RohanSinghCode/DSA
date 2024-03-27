public class SkipCharacter {
    public String buildStringWithoutA(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }

        char ch = str.toCharArray()[0];
        if (ch != 'a') {
            return ch + buildStringWithoutA(str.substring(1));
        } else {
            return buildStringWithoutA(str.substring(1));
        }
    }
}
