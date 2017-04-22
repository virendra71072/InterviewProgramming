package math;

import java.util.ArrayList;
import java.util.Collections;

/*Given a number N, find all factors of N.

Example:

N = 6 
factors = {1, 2, 3, 6}
Make sure the returned array is sorted.
*/
public class AllFactors {
  ArrayList<Integer> allFactors(int a) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i=1; i<=(int)Math.sqrt(a); i++){
        if(a%i==0){
            result.add(i);
            //do not cast to integer may result into same root value
            if(i!=Math.sqrt(a))
                result.add(a/i);
            
        }
    }
    Collections.sort(result);
    return result;
}
}
