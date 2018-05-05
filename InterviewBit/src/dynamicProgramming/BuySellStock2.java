package dynamicProgramming;

/*Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
Example :Input : [1 2 3]
         Return : 2*/

import java.util.List;

public class BuySellStock2 {

    public static void main(String[] args) {

        System.out.println(new BuySellStock2().maxProfit(List.of(1, 2, 3)));
    }

    public int maxProfit(final List<Integer> A) {

        if (A == null || A.isEmpty()) {
            return 0;
        }
        if (A.size() == 1) {
            return 0;
        }

        int i = 0;
        int listSize = A.size();
        int maxProfit = 0;
        while (i < listSize) {
            int buy = 0, sell = 0;
            while (i < listSize - 1 && A.get(i + 1) <= A.get(i)) {
                i++;
            }
            buy = A.get(i);
            i++;
            while (i < listSize && A.get(i - 1) <= A.get(i)) {
                i++;
            }
            sell = A.get(i - 1);

            maxProfit += (sell - buy);
        }

        return maxProfit;
    }
}
