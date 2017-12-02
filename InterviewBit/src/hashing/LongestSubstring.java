package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/*
Longest Substring Without Repeat

Given a string,
 find the length of the longest substring without repeating characters.
 Example:
    The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

    For "bbbbb" the longest substring is "b", with the length of 1.*/
public class LongestSubstring {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("dadbc", "abcabcbb");
        list.forEach((String string) -> {
            System.out.println(lengthOfLongestSubString(string));
        });
    }

    private static int lengthOfLongestSubString(String str) {
        HashSet<Character> set = new HashSet<>();
        int max = 0, currMax = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (!set.contains(character)) {
                currMax++;
                if (currMax > max) {
                    max = currMax;
                }
                set.add(character);
            } else {
                i = i - currMax;
                currMax = 0;
                set.clear();
            }
        }
        return max;
    }
}
