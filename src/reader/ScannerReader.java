package reader;

import java.util.Scanner;

public class ScannerReader {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer");
		int a = sc.nextInt();
		System.out.println("enter a string");
		String b = sc.nextLine();
		System.out.println("Integer: "+a+" "+"String: "+b );
	}
}
