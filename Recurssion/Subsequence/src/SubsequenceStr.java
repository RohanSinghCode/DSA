public class SubsequenceStr {
    public void printSubseq(String p, String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.toCharArray()[0];
        printSubseq(p + ch, up.substring(1));
        printSubseq(p, up.substring(1));
    }
}
