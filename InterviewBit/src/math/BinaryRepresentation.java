package math;

/*Given a number N >= 0, find its representation in binary.
Example:
if N = 6,
binary form = 110*/
public class BinaryRepresentation {

  public String findDigitsInBinary(int a) {
    if (a == 0)
      return "0";
    StringBuilder result = new StringBuilder();
    while (a > 0) {
      result.append(a % 2);
      a = a / 2;
    }
    return result.reverse().toString();
  }
}
