package strings;

/*Given two binary strings, return their sum (also a binary string).
Example:
a = "100"
b = "11"
Return a + b = “111”.
See Expected Output
*/
public class AddBinaryString {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0)
        sum += a.charAt(i--) - '0';
      if (j >= 0)
        sum += b.charAt(j--) - '0';
      sb.append(sum % 2);
      carry = sum / 2;
    }
    if (carry != 0)
      sb.append(carry);
    return sb.reverse().toString();
  }
}
