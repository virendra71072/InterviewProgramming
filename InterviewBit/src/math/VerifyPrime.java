package math;

/*Given a number N, verify if N is prime or not.

Return 1 if N is prime, else return 0.

Example :

Input : 7
Output : True*/
public class VerifyPrime {
  public int isPrime(int a) {
    if (a < 2)
      return 0;
    int num = 2;
    int limit = (int) Math.sqrt(a);
    while (num <= limit) {
      if (a % num == 0)
        return 0;
      num++;
    }
    return 1;
  }
}
