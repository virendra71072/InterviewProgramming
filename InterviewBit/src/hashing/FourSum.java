package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

        Note:
        Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
        The solution set must not contain duplicate quadruplets.
        Example :
        Given array S = {1 0 -1 0 -2 2}, and target = 0
        A solution set is:

        (-2, -1, 1, 2)
        (-2,  0, 0, 2)
        (-1,  0, 0, 1)*/
public class FourSum {

    public static void main(String[] args) {
        fourSum(new ArrayList<Integer>(Arrays.asList(9, -8, -10, -7, 7, -8, 2, -7, 4, 7, 0, -3, -4, -5, -1, -4, 5, 8, 1,
                9, -2, 5, 10, -5, -7, -1, -6, 4, 1, -5, 3, 8, -4, -10, -9, -3, 10, 0, 7, 9, -8, 10, -9, 7, 8, 0, 6, -6,
                -7, 6, -4, 2, 0, 10, 1, -2, 5, -2)), 0).forEach(res -> System.out.println(res));
    }

    private static ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> list, int target) {
        Collections.sort(list);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < list.size()-3; i++){
            if(i>0 && list.get(i)==list.get(i-1))
                continue;
            for (int j = i + 1; j < list.size()-2; j++) {
                if(j>i+1 && list.get(j)==list.get(j-1))
                    continue;
                int firstSum = list.get(i) + list.get(j);
                int k = j + 1, l = list.size() - 1;
                while (k < l) {
                    int searchSum = list.get(k) + list.get(l)+firstSum;
                    if (searchSum == target) {
                        result.add(new ArrayList<>(Arrays.asList(list.get(i), list.get(j), list.get(k), list.get(l))));
                        while (k<l && list.get(k)==list.get(k+1))
                            k++;
                        while(k<l && list.get(l)==list.get(l-1))
                            l--;
                        k++;
                        l--;
                    }
                    if (searchSum < target) {
                        k++;
                    }
                    if (searchSum > target) {
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
