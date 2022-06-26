package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a string");
		String b = br.readLine();
		System.out.println("Integer: "+a+" "+"String: "+b);
	}

}
