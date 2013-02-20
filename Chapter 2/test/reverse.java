/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class reverse {

  public static void main(String[] args) {
    String str = "What's going on?";
    System.out.println(ReverseString.reverseIt(str));
    int i, len = str.length();
    StringBuffer dest = new StringBuffer(len);

    for (i = (len - 1); i >= 0; i--)
      dest.append(str.charAt(i));

  }
}




