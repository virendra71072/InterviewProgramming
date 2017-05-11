package strings;

public class CountAndSay {
  public String countAndSay(int a) {

    StringBuilder str = new StringBuilder("1");
    for (int i = 0; i < a - 1; i++) {
      int j = 0;
      int len = str.length();
      StringBuilder say = new StringBuilder();
      while (j < len) {
        int count = 1;
        while (j < len - 1 && str.charAt(j) == str.charAt(j + 1)) {
          count++;
          j++;
        }
        say.append(count + "" + str.charAt(j));
        j++;
      }
      str = say;
    }
    return str.toString();

  }
}
