class Solution {
    public int[] finalPrices(int[] prices) {
        int[] finalPrices = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int finalPrice = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if(finalPrice >= prices[j]) {
                    finalPrice -= prices[j];
                    break;
                }                            
            }
            
            finalPrices[i] = finalPrice;
        }
        return finalPrices;
    }
}