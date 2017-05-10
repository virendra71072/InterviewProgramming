package twoPointers;

import java.util.ArrayList;

/*Given an array and a value, remove all the instances of that value in the array. 
Also return the number of elements left in the array after the operation.
It does not matter what is left beyond the expected length.
*/

public class RemoveElementFromArray {
  public int removeElement(ArrayList<Integer> a, int b) {
    int j = 0;
    int i = 0;
    while (i < a.size()) {
      if (a.get(i) != b) {
        a.set(j++, a.get(i));
      }
      i++;
    }
    return j;
  }
}
