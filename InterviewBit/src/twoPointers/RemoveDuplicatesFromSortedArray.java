package twoPointers;

import java.util.ArrayList;

/*Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

 Example: 
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2]. 
*/
public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(ArrayList<Integer> a) {
    if (a.size() <= 1)
      return 1;
    int i = 0;
    for (int j = 0; j < a.size(); j++) {
      int n = a.get(j);
      if (i == 0 || n > a.get(i - 1))
        a.add(i++, n);
    }
    return i;
  }
}
