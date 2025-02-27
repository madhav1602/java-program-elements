// Creating class CourseFeeDiscount to indicate the purpose
class CourseFeeDiscount {

    public static void main(String[] args) {
        
        // Define the original course fee
        double fee = 125000;
        
        // Define the discount percentage
        double discountPercent = 10;
        
        // Calculate the discount amount
        double discountAmount = (fee * discountPercent) / 100;
        
        // Calculate the discounted fee
        double discountedFee = fee - discountAmount;
        
        // Display the results 
        System.out.println(
            "The discount amount is INR " + discountAmount + 
            " and final discounted fee is INR " + discountedFee
        );
    }
}
