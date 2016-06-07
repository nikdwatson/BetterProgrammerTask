package palindrome;

public class BetterProgrammerTask {

    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
        int length = s.length();
        char[] xyz = s.toCharArray();
        char[] zyx = new char[length];

        for (int i = 0; i < length; i++) {
            zyx[i] = xyz[length-1-i];
        }

        return (new String(xyz)).equals(new String(zyx));
    }
}
