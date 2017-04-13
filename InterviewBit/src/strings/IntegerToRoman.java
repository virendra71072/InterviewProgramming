package strings;

public class IntegerToRoman {
  public String intToRoman(int a) {
    if (a < 1 || a > 3999)
      return "";
    StringBuilder result = new StringBuilder();
    int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    for (int i = 0; i < numbers.length; i++) {
      while (a >= numbers[i]) {
        result.append(letters[i]);
        a -= numbers[i];
      }
    }
    return result.toString();
  }
}
