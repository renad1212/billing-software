double discount = 0; 
        if (total > 50) { 
            discount = total * 0.10; 
        } 
 
        double finalAmount = total - discount; 
 
        System.out.printf("Total bill: %.3f OMR%n", total); 
        System.out.printf("Discount: %.3f OMR%n", discount); 
        System.out.printf("Amount to pay: %.3f OMR%n", finalAmount); 
 
        input.close(); 
    } 
} 
