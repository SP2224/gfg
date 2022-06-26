package reader;

import java.util.Scanner;

public class ScannerReader1 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String a = sc.nextLine();
	 System.out.println("your entered string is "+a);
	 int b = sc.nextInt();
	 System.out.println("your entered integer is "+b);
	 float c = sc.nextFloat();
	 System.out.println("your entered float is "+c);
 }
}
