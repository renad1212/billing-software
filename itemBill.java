System.out.print("Enter coupon code (or NONE): "); 
        String coupon = input.next(); 
 
        if (coupon.equalsIgnoreCase("SAVE5")) { 
            // Coupon discount cannot exceed the remaining bill. 
            couponDiscount = Math.min(5, total - discount); 
            System.out.println("Coupon applied successfully!"); 
        } else if (!coupon.equalsIgnoreCase("NONE")) { 
            System.out.println("Invalid coupon code."); 
        } 
