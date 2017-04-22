package math;

import java.util.ArrayList;

/*Given a number N, find all prime numbers upto N ( N included ).

Example:

if N = 7,

all primes till 7 = {2, 3, 5, 7}

Make sure the returned array is sorted*/
public class PrimeNumbers {
  public ArrayList<Integer> sieve(int a) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (a < 2)
      return result;
    for (int i = 2; i <= a; i++) {
      if (isPrime(i)) {
        result.add(i);
      }
    }
    return result;
  }

  private boolean isPrime(int n) {
    int num = (int) Math.sqrt(n);
    for (int i = 2; i <= num; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
