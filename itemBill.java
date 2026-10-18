public class ItemBill { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter the price of item 1: "); 
        double item1 = input.nextDouble(); 
 
        System.out.print("Enter the price of item 2: "); 
        double item2 = input.nextDouble(); 
 
        System.out.print("Enter the price of item 3: "); 
        double item3 = input.nextDouble(); 
 
        double total = item1 + item2 + item3; 
 
        System.out.printf("Total bill: %.2f%n", total); 
 
        input.close(); 
           double discount = 0; 
        if (total > 50) { 
            discount = total * 0.10; 
        } 
 
        double finalAmount = total - discount; 
 
        System.out.printf("Total bill: %.3f OMR%n", total); 
        System.out.printf("Discount: %.3f OMR%n", discount); 
        System.out.printf("Amount to pay: %.3f OMR%n", finalAmount); 
 
        input.close(); 
        System.out.print("Enter coupon code (or NONE): "); 
        String coupon = input.next(); 
 
        if (coupon.equalsIgnoreCase("SAVE5")) { 
            // Coupon discount cannot exceed the remaining bill. 
            couponDiscount = Math.min(5, total - discount); 
            System.out.println("Coupon applied successfully!"); 
        } else if (!coupon.equalsIgnoreCase("NONE")) { 
            System.out.println("Invalid coupon code."); 
        } 
    } 
} 
} 
} 

 
