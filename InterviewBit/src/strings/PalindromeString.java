package strings;

/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Example:
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
See Expected Output
*/
public class PalindromeString {

  public int isPalindrome(String a) {

    if (a.length() == 0)
      return 0;
    if (a.length() == 1)
      return 1;

    int size = a.length();
    String lcs = a.toLowerCase();
    int left = 0;
    int right = size - 1;
    while (right >= left) {
      if (lcs.charAt(right) == lcs.charAt(left)) {
        right--;
        left++;
      } else if (!Character.isLetter(lcs.charAt(right)) && !Character.isDigit(lcs.charAt(right))) {
        right--;
      } else if (!Character.isLetter(lcs.charAt(left)) && !Character.isDigit(lcs.charAt(left))) {
        left++;
      } else {
        return 0;
      }
    }

    return 1;
  }
}
