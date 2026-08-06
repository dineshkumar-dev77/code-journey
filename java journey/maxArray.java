import java.util.Scanner;

public class maxArray {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter stocks prices");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        maxArray solution = new maxArray();
        int result = solution.maxProfit(prices);
        System.out.println(result);
        sc.close();
    }
}