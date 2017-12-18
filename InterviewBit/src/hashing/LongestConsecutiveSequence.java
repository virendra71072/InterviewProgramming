package hashing;

import java.util.HashSet;
import java.util.List;
/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

        Example:
        Given [100, 4, 200, 1, 3, 2],
        The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

        Your algorithm should run in O(n) complexity.*/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        System.out.println(longestConsecutive(List.of(100, 4, 200, 1, 3, 2)));
    }

    private static int longestConsecutive(List<Integer> input) {
        HashSet<Integer> set = new HashSet<>();
        input.forEach(set::add);

        Integer longest = 0;
        for (int value : set) {
            if (!set.contains(value - 1)) {
                int max = value + 1;
                while (set.contains(max)) {
                    max++;
                }
                longest = Math.max(longest, max - value);
            }
        }
        return longest;
    }


}
