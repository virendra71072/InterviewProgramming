package twoPointers;

import java.util.ArrayList;
import java.util.Collections;

/*Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers.

Assume that there will only be one solution

Example: 
given array S = {-1 2 1 -4}, 
and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)*/
public class _3Sum {

  public int threeSumClosest(ArrayList<Integer> a, int b) {
    if (a == null || a.size() < 3) {
      return 0;
    }
    Collections.sort(a);
    int result = a.get(0) + a.get(1) + a.get(2);

    int len = a.size();
    int diff = 0;
    int mid = 0;
    int high = 0;
    int sum = 0;
    for (int i = 0; i < len - 2; i++) {
      diff = b - a.get(i);
      mid = i;
      high = len - 1;
      while (mid < high) {
        sum = a.get(mid) + a.get(high);
        if (sum == diff) {
          return b;
        } else if (sum < diff) {
          mid++;
        } else {
          high--;
        }
        int tempDiff = Math.abs(diff - sum);
        int otherDiff = Math.abs(result - b);
        if (tempDiff < otherDiff) {
          result = sum + a.get(i);
        }
      }
    }
    return result;
  }
}
