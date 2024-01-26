public class bestTimetoBuySell {
    public static void main(String[] args) {
        System.out.println("Best Time To Buy And Sell Stock");
        int prices[]={7,1,5,3,6,4};
        int minSoFar=prices[0];
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (minSoFar>prices[i]) {
                minSoFar=prices[i];
            }
            int profit=prices[i]-minSoFar;
            maxProfit=Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
        
    }
}
