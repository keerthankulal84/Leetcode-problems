public class stock {

    static class Solution {

        public int maxProfit(int[] prices) {

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {

                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }

                int profit = prices[i] - minPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }
    }

    public static void main(String[] args) {

        int[] prices = {10, 1, 5, 6, 7, 1};

        Solution solution = new Solution();

        System.out.println(solution.maxProfit(prices));
    }
}