package twoPointers;

/*Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]
*/
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
  public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (a == null || b == null)
      return result;
    if (a.isEmpty() || b.isEmpty())
      return result;
    int i = 0, j = 0;
    while (i < a.size() && j < b.size()) {
      if (a.get(i) < b.get(j))
        i++;
      else if (a.get(i) > b.get(j))
        j++;
      else {
        result.add(a.get(i));
        i++;
        j++;
      }
    }
    return result;
  }
}
