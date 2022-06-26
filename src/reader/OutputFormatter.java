package reader;

import java.text.DecimalFormat;

public class OutputFormatter {
	public static void main(String[] args) {
		int x =100;
		 System.out.printf(
		            "Printing simple integer: x = %d\n", x);
		// this will print it upto 2 decimal places
	        System.out.printf(
	            "Formatted with precision: PI = %.2f\n",
	            Math.PI);
	 
	        float n = 5.2f;
	 
	        // automatically appends zero to the rightmost part
	        // of decimal
	        System.out.printf(
	            "Formatted to specific width: n = %.4f\n", n);
	 
	        n = 2324435.3f;
	 
	        // here number is formatted from right margin and
	        // occupies a width of 20 characters
	        System.out.printf(
	            "Formatted to right margin: n = %20.4f\n", n);
	        
	        
	        
	        double num = 123.4567;
	        
	        // prints only numeric part of a floating number
	        DecimalFormat ft = new DecimalFormat("####");
	        System.out.println("Without fraction part: num = "
	                           + ft.format(num));
	 
	        // this will print it upto 2 decimal places
	        ft = new DecimalFormat("#.##");
	        System.out.println(
	            "Formatted to Give precision: num = "
	            + ft.format(num));
	 
	        // automatically appends zero to the rightmost part
	        // of decimal instead of #,we use digit 0
	        ft = new DecimalFormat("#.000000");
	        System.out.println(
	            "appended zeroes to right: num = "
	            + ft.format(num));
	 
	        // automatically appends zero to the leftmost of
	        // decimal number instead of #,we use digit 0
	        ft = new DecimalFormat("00000.00");
	        System.out.println(
	            "formatting Numeric part : num = "
	            + ft.format(num));
	 
	        // formatting money in dollars
	        double income = 23456.789;
	        ft = new DecimalFormat("$###,###.##");
	        System.out.println("your Formatted Dream Income : "
	                           + ft.format(income));
	
	}

}
