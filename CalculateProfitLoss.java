// Creating class CalculateProfitLoss to indicate its purpose
class CalculateProfitLoss {

    public static void main(String[] args) {
        
        // Define cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;
        
        // Calculate profit
        double profit = sellingPrice - costPrice;
        
        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display the result using 
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
