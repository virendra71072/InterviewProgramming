package backtracking;

import java.util.Arrays;
import java.util.LinkedList;

/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
The same repeated number may be chosen from C unlimited number of times.
 Note:
   All numbers (including target) will be positive integers.
   The solution set must not contain duplicate combinations.
   For example, given candidate set [2, 3, 6, 7] and target 7,
   A solution set is:
    [
      [7],
       [2, 2, 3]
     ]
*/

public class CombinationSum {

    int count = 0;

    public static void main(String[] args) {

        int[] input = {2, 3, 6, 7};
        int[][] result = new CombinationSum().combinationSum(input, 7);
    }

    private int[][] combinationSum(int[] input, int target) {

        int[][] result = new int[input.length][];

        Arrays.sort(input);
        combination(result, new LinkedList<Integer>(), input, target, 0);

        return result;
    }

    private void combination(int[][] result, LinkedList<Integer> list, int[] input, int target, int start) {

        if (target == 0) {
            int[] temp = new int[list.size()];
            int i = 0;
            for (int value : list) {
                temp[i++] = value;
            }
            result[count++] = temp;
        } else if (target > 0) {
            for (int i = start; i < input.length; i++) {
                list.add(input[i]);
                combination(result, list, input, target - input[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
