package twoPointers;

import java.util.ArrayList;

/*Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note: You have to modify the array A to contain the merge of A and B. Do not output anything in your code.
TIP: C users, please malloc the result into a new array and return the result. 
If the number of elements initialized in A and B are m and n respectively, the resulting size of array A after your code is executed should be m + n

Example :

Input : 
        A : [1 5 8]
        B : [6 9]

Modified A : [1 5 6 8 9]
*/
public class MergeTwoSortedListII {

  public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    int i = 0;
    int j = 0;

    while (i < a.size() && j < b.size()) {
      if (a.get(i) < b.get(j)) {
        result.add(a.get(i));
        i++;
      } else {
        result.add(b.get(j));
        j++;
      }
    }
    // process the remaining elements
    if (i < a.size()) {
      result.addAll(a.subList(i, a.size()));
    }
    if (j < b.size()) {
      result.addAll(b.subList(j, b.size()));
    }
    // clear old values to store new one
    a.clear();
    result.forEach(value -> {
      a.add(value);
    });
  }
}
