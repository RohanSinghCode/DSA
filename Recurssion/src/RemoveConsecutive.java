public class RemoveConsecutive {
    public String remove(String str)
    {
        if (str.length() == 1) {
            return str;
        }

        char[] strArray = str.toCharArray();
        if (strArray[0] == strArray[1])
        {
            return remove(str.substring(1));
        } else {
            return str.substring(0,1) + remove(str.substring(1));
        }

    }
}
