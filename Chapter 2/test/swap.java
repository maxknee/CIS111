/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class swap{
    public static String magic(String s)
    {
        String r = "";
        boolean got = false;
        for (int i = 0; i < s.length(); ++i)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                r = r +s.charAt(i);
                got = true;
            } else if(got)
            {
               return r;
            }
        }
        return r;
    }
    public static void main(String[] args)
    {
        System.out.println(magic("ABCd45&*31"));
    }

}
